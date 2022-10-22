package com.example.gessnumberbindingfragment.data;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.Random;

public class PartidaGuessNumer implements Serializable, Parcelable {
    private static Random rnd = new Random();
    private String usuario;
    private Integer numTries;
    private Integer vecFalladas;
    private Integer numSecreto;
    private boolean victoria;

    public PartidaGuessNumer(String usuario, Integer numTries) {
        this.usuario = usuario;
        this.numTries = numTries;
        this.numSecreto = null;
        this.vecFalladas = 0;
        this.victoria = false;
    }

    public PartidaGuessNumer() {
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setVictoria(boolean victoria) {
        this.victoria = victoria;
    }

    public Integer getNumTries() {
        return numTries;
    }

    public void setNumTries(Integer numTries) {
        this.numTries = numTries;
    }

    public Integer getVecFalladas() {
        return vecFalladas;
    }

    public void setVecFalladas(Integer vecFalladas) {
        this.vecFalladas = vecFalladas;
    }

    public Integer getNumSecreto() {
        return numSecreto;
    }

    public void setNumSecreto(Integer numSecreto) {
        this.numSecreto = numSecreto;
    }

    public boolean isVictoria() {
        return victoria;
    }

    public void restarIntento(){ numTries--; }

    public  void  sumarFallo(){ vecFalladas++; }

    public static Integer genNumSecreto() { return rnd.nextInt(100-1) + 1; }

    //region metodos de la interfaz Parceable
    protected PartidaGuessNumer(Parcel in) {
        usuario = in.readString();
        if (in.readByte() == 0) {
            numTries = null;
        } else {
            numTries = in.readInt();
        }
        if (in.readByte() == 0) {
            vecFalladas = null;
        } else {
            vecFalladas = in.readInt();
        }
        if (in.readByte() == 0) {
            numSecreto = null;
        } else {
            numSecreto = in.readInt();
        }
        victoria = in.readByte() != 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(usuario);
        if (numTries == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(numTries);
        }
        if (vecFalladas == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(vecFalladas);
        }
        if (numSecreto == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(numSecreto);
        }
        dest.writeByte((byte) (victoria ? 1 : 0));
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<PartidaGuessNumer> CREATOR = new Creator<PartidaGuessNumer>() {
        @Override
        public PartidaGuessNumer createFromParcel(Parcel in) {
            return new PartidaGuessNumer(in);
        }

        @Override
        public PartidaGuessNumer[] newArray(int size) {
            return new PartidaGuessNumer[size];
        }
    };
    //endregion
}
