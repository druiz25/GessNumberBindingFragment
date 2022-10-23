# GessNumberBindingFragment
Autor: Daniel Ruiz Villodres <br />
Minimum SDK: API 21 Android 5.0 (Lollipop)
<br /><br />Es un simple juego de adivinar un numero aleatorio en un numero de tiradas que decida el usuario introduciendo su nombre y estos en esta aplicacion se hace uso de los fragment en vez de activity aparte de implementar el data y view binding y guardando los estados lo que permite que se gire la pantalla sin perder datos introducidos.

# Desglose del proyecto
-Clase PartidaGuessNumer
  implementa la interfaz Serializable, Parcelable para pasar el objeto de un fragment a otro.
# -FragmentConfig
  Diseño fragment <br />
[![ConfigActivity](https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEiBQB8d_oGUjOlH4RrN7A5l8ZEggXpQHd9rDm-spai37WS7rMPE6AClIyvYw70XETRB2s0Ih7ymeXL9tQKmwWi0VicZgU32zx3d8_gbtpg3HTnM1y4bMaaqlg7notOBw21f4-yakS1XvUpydOdmFSMDTY_ZiCsY8Cz81a_NYxeh3Z5rRRr1OfXqvA-uyg/s320/2.PNG "ConfigActivity")](https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEiBQB8d_oGUjOlH4RrN7A5l8ZEggXpQHd9rDm-spai37WS7rMPE6AClIyvYw70XETRB2s0Ih7ymeXL9tQKmwWi0VicZgU32zx3d8_gbtpg3HTnM1y4bMaaqlg7notOBw21f4-yakS1XvUpydOdmFSMDTY_ZiCsY8Cz81a_NYxeh3Z5rRRr1OfXqvA-uyg/s320/2.PNG "ConfigActivity")

Diseño fragment(land) <br />
[![configLand](https://blogger.googleusercontent.com/img/a/AVvXsEh3UuKaH58d_c325xbz5rI2cOX8ZmHkXv2hZsrhn-PitRZs0I19S07FrQ-boiHA_9wuKxAW3yqazLQTJQxUs0w0no3dTKSIV166J66-2ORIvUP1_4Fix7iUIQNu6Mq-hm7e0XARCXnxgkzqI3e6XKIpWetW3gqi2JJE_B8Z3u78ZMvIT7g5BG6OspF2uA "configLand")](https://blogger.googleusercontent.com/img/a/AVvXsEh3UuKaH58d_c325xbz5rI2cOX8ZmHkXv2hZsrhn-PitRZs0I19S07FrQ-boiHA_9wuKxAW3yqazLQTJQxUs0w0no3dTKSIV166J66-2ORIvUP1_4Fix7iUIQNu6Mq-hm7e0XARCXnxgkzqI3e6XKIpWetW3gqi2JJE_B8Z3u78ZMvIT7g5BG6OspF2uA "configLand")

Contiene dos edit text para introducir el usuario y el numero de intentos aparte de un  boton para enviar los datos recogidos en un objeto de la clase PartidaGuessNumer que se introducira en un bundle a menos que dejes algun campo sin rellenar en caso de que esto ocurra no se crea un objeto de la clase y aparecera un toast avisando de que hay algun campo sin rellenar.


# -FragmentPlay
  Diseño Fragment  <br />
[![PlayActivity](https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEjEAvAU7cxLxLmqdiDv5wgVyScjPaw45QJI4CtfZ5Z4SklLaQdNiF1xyUByWl0ylx3gaMmiXEEPdRDYCQ8YBOvu8llQU5ARuUwUfHTk8kSwIRJ0U_Ug0vBO513SUFp8hKqKDljHwDBA2GufILaKZH3toyf4TRrj-ikr7u7ArtlpnlBjdBZFXNx3vvoBKg/s320/3.PNG "PlayActivity")](https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEjEAvAU7cxLxLmqdiDv5wgVyScjPaw45QJI4CtfZ5Z4SklLaQdNiF1xyUByWl0ylx3gaMmiXEEPdRDYCQ8YBOvu8llQU5ARuUwUfHTk8kSwIRJ0U_Ug0vBO513SUFp8hKqKDljHwDBA2GufILaKZH3toyf4TRrj-ikr7u7ArtlpnlBjdBZFXNx3vvoBKg/s320/3.PNG "PlayActivity")

Diseño fragment(land)<br />
[![playLand](https://blogger.googleusercontent.com/img/a/AVvXsEhhCGzVCid6HhG6MQ-43_xAGsw_8i9S6l6i88MIh-ZcoYhTU4jwgnYjRq3JnbruPvk8U_YXnqd06i3SspHcwLyyrZIwR_W5HmxTN9bgk-mdiDcNbgwwiPVwihwlMUt2WhWjIl_BVkWNxRcYwlRKqukJ7j26qiHoH8EtLaW4jzU4XWdH_Fi67CRipLRzHQ "playLand")](https://blogger.googleusercontent.com/img/a/AVvXsEhhCGzVCid6HhG6MQ-43_xAGsw_8i9S6l6i88MIh-ZcoYhTU4jwgnYjRq3JnbruPvk8U_YXnqd06i3SspHcwLyyrZIwR_W5HmxTN9bgk-mdiDcNbgwwiPVwihwlMUt2WhWjIl_BVkWNxRcYwlRKqukJ7j26qiHoH8EtLaW4jzU4XWdH_Fi67CRipLRzHQ "playLand")


Fragment cuando introduces un numero mayor  <br />
[![ActivityPlay2](https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEiwK4tBTXAJ1KGpsPBO59LXJUPa4-lFhDtobu2t97kBgc9-PZ_Pgdh8YfikZr6pFYQGRtB1Z4f9n3FSSOFqOCzLNyiBR-NrKwJ_dylS8wsVJ6Uk62uN2lJ_kx37iLmYpRadPpUR1kjLgBPDSacLxlW-KJYE4VZD2JpfMsreIGnZmnEpTiXOd-6XK9lfHg/s320/5.PNG "ActivityPlay2")](https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEiwK4tBTXAJ1KGpsPBO59LXJUPa4-lFhDtobu2t97kBgc9-PZ_Pgdh8YfikZr6pFYQGRtB1Z4f9n3FSSOFqOCzLNyiBR-NrKwJ_dylS8wsVJ6Uk62uN2lJ_kx37iLmYpRadPpUR1kjLgBPDSacLxlW-KJYE4VZD2JpfMsreIGnZmnEpTiXOd-6XK9lfHg/s320/5.PNG "ActivityPlay2")


Fragment cuando introduces un numero menor  <br />
[![ActivityPlay3](https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEh4D-S7Qds97yKq47ZcJdyuQcySDjCDmoeOrK3xW8QuGv0UFWqnGIJGDrb8z3-mtsKDH8evBg8vmTMdiKqzYCEOLO02_uAqekvw7fmXSf2Zy5HG6G21H6TFb_wH3C8f3R47AazTe7t7SyG9qBux18vci_nyj55nq_rxPyNjM7h2imylq0KQCfrN-0Asdw/s320/6.PNG "ActivityPlay3")](https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEh4D-S7Qds97yKq47ZcJdyuQcySDjCDmoeOrK3xW8QuGv0UFWqnGIJGDrb8z3-mtsKDH8evBg8vmTMdiKqzYCEOLO02_uAqekvw7fmXSf2Zy5HG6G21H6TFb_wH3C8f3R47AazTe7t7SyG9qBux18vci_nyj55nq_rxPyNjM7h2imylq0KQCfrN-0Asdw/s320/6.PNG "ActivityPlay3")


Contiene un text view para enseñar el resultado del intento en caso de que se falle indicara si el numero introducido fue menor/mayor que el numero secreto, un edit text donde el usuario introducira el numero para ver si coincide con el numero secreto y un boton que usa el metodo comprobarRespuesta que en caso de que falles suma un fallo mas a la cuenta de intentos fallidos y si te quedas sin intentos o aciertas crea una intancia de PartidaGuessNumer introduciendo los datos obtenidos del bundle y los conseguidos en esta activity como el numero secreto y el numero de fallos, estos son enviados en un intent con el bundle a la EndPlayActivity.

# -FragmentEndPlay

  Fragment en caso de acertar  <br />
[![ActivityEndPlay2](https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEiDO_aU8k27oAOVlgceZ-n8-Wnb6i-ewNbtdABSApicGoKXcWP7AtDeQUUZdEkGxdR2lN_hqQD2q-ZxMQXeaExt-Sp5blbnAuZ09TfZj8hv8-yXnpeWe8jIPw9vjvIiQT6R2urrybxJwYgH4dJCCCRRLMV6BcRDHRYjrCqJKwtrNYdIs0ev3SnXKa2Ayw/s320/7.PNG "ActivityEndPlay2")](https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEiDO_aU8k27oAOVlgceZ-n8-Wnb6i-ewNbtdABSApicGoKXcWP7AtDeQUUZdEkGxdR2lN_hqQD2q-ZxMQXeaExt-Sp5blbnAuZ09TfZj8hv8-yXnpeWe8jIPw9vjvIiQT6R2urrybxJwYgH4dJCCCRRLMV6BcRDHRYjrCqJKwtrNYdIs0ev3SnXKa2Ayw/s320/7.PNG "ActivityEndPlay2")

  Fragment en caso de acertar(land)  <br />
[![endPlayLand](https://blogger.googleusercontent.com/img/a/AVvXsEh4Ttzx5Ka0prJqx7ZYxjh7vNRNv_fhTuASYPoJv3TSiIElHfLO5GbR9ZdnEXliXnoR9z8SOiorgYE_EH3U1qbZVNu26n_qODuzZZQ4qvGQ94W8tKX6HYYoLeOnjn4wUew7oNBS5jMHimftHFCDCPrehXETbmWfmkPAWD4pGtV0uBkTfMhpo-iaaqVexg "endPlayLand")](https://blogger.googleusercontent.com/img/a/AVvXsEh4Ttzx5Ka0prJqx7ZYxjh7vNRNv_fhTuASYPoJv3TSiIElHfLO5GbR9ZdnEXliXnoR9z8SOiorgYE_EH3U1qbZVNu26n_qODuzZZQ4qvGQ94W8tKX6HYYoLeOnjn4wUew7oNBS5jMHimftHFCDCPrehXETbmWfmkPAWD4pGtV0uBkTfMhpo-iaaqVexg "endPlayLand")

  Fragment en caso de agotar los intentos  <br />
[![EndPlayFallar](https://blogger.googleusercontent.com/img/a/AVvXsEjmmfdc48uoyEmqJM0ICHwQ9jtY0KaH0ktEaqSRB2jeBjL_4AbU2Cv4iIxS8v20mEsmnjTDyhvmGPJzSd7ZexsNc-Y2ZDP4tL_LVAXZ9tTeaEL8vgpRQUK0T2_3PS3woqqkNOM2eNj4Q7q43kT0HrQEqO4DrdGBcC9CE0uyX5avWRgXlHBhSSywA2J_6Q "EndPlayFallar")](https://blogger.googleusercontent.com/img/a/AVvXsEjmmfdc48uoyEmqJM0ICHwQ9jtY0KaH0ktEaqSRB2jeBjL_4AbU2Cv4iIxS8v20mEsmnjTDyhvmGPJzSd7ZexsNc-Y2ZDP4tL_LVAXZ9tTeaEL8vgpRQUK0T2_3PS3woqqkNOM2eNj4Q7q43kT0HrQEqO4DrdGBcC9CE0uyX5avWRgXlHBhSSywA2J_6Q "EndPlayFallar")

 Fragment en caso de fallar(land)  <br />
  [![endPlayFallarLand](https://blogger.googleusercontent.com/img/a/AVvXsEg5rp-_awmcJCMGNsiJdl-JJQvQsJVBA9IW-zmpJUxgAdCKE85Qzr5QJsLZuNaVIfoevrlFGmHtHStz14TXDu_Fnjh_Gd4E3Tkrqk-Sn8im2uqV04yuF5w1ajx5TZ4rOIQvVGkVrpC_sV4vbUEKF9BrjqSJT2eBonhg_Bsr9XD2jftiY9vFlPgLSSQv8g "endPlayFallarLand")](https://blogger.googleusercontent.com/img/a/AVvXsEg5rp-_awmcJCMGNsiJdl-JJQvQsJVBA9IW-zmpJUxgAdCKE85Qzr5QJsLZuNaVIfoevrlFGmHtHStz14TXDu_Fnjh_Gd4E3Tkrqk-Sn8im2uqV04yuF5w1ajx5TZ4rOIQvVGkVrpC_sV4vbUEKF9BrjqSJT2eBonhg_Bsr9XD2jftiY9vFlPgLSSQv8g "endPlayFallarLand")

Tiene un textView que enseña el resultado si el usuario acerto se le muestra el numero de veces que fallo y si se quedo sin oportunidades se le muestra cual era el numero secreto para decidir esto coje la instancia PartidaGuessNumer y lee el booleano victoria, si es false es que el usuario perdio y si es true es que acerto el numero y a aparte de esa instancia saca el numero secreto y los intentos del usuario aparte de un boton que te regresa a la pantalla inicial. <br /> <br/>

Aparte se cambio el icono predeterminado de la aplicacion por otro mas adecuado. <br /> <br />
[![iconoGuessNumber](https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEhpBXFi0zK1XGMh2Uyw71DtaLxx6jfxkJAw7XZMWizi7k5JIzO_GCU5rgoF4s3UBmsVt_IcAVvUPOqhdQR5bh8DTrRdd_Iegncy-uDeCzkxjOaHild6-y76W23ZafV2B2oDoo_NMLopcvgK4kC82ZdChtDiJHlYaAreYu9cipEHTiS3LARh7gqFNNTu5w/s1600/icono.PNG "iconoGuessNumber")](https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEhpBXFi0zK1XGMh2Uyw71DtaLxx6jfxkJAw7XZMWizi7k5JIzO_GCU5rgoF4s3UBmsVt_IcAVvUPOqhdQR5bh8DTrRdd_Iegncy-uDeCzkxjOaHild6-y76W23ZafV2B2oDoo_NMLopcvgK4kC82ZdChtDiJHlYaAreYu9cipEHTiS3LARh7gqFNNTu5w/s1600/icono.PNG "iconoGuessNumber")
