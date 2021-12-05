package ce.micros.borrowers.persistencia.mapeadores;

import ce.micros.borrowers.nucleo.modelo.Deudor;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class MapeadorFilaDeudor implements RowMapper<Deudor> {
    @Override
    public Deudor mapRow(ResultSet resultSet, int i) throws SQLException {
        Deudor deudor = new Deudor();
        deudor.setTipoCliente(resultSet.getString("TIPO_CLIENTE"));
        deudor.setOrigen(resultSet.getInt("ORIGEN"));
        deudor.setRegionalBeta(resultSet.getString("REGIONAL_BETA"));
        deudor.setCiaInicialProducto(resultSet.getInt("CIA_INICIAL_PRODUCTO"));
        deudor.setTipoId(resultSet.getInt("TIPO_ID"));
        deudor.setIdentificacion(resultSet.getInt("IDENTIFICACION"));
        deudor.setObligacion(resultSet.getLong("OBLIGACION"));
        deudor.setCreditoAnterior(resultSet.getInt("CREDITO_ANTERIOR"));
        deudor.setDiasDeMoraInicialProducto(resultSet.getInt("DIAS_DE_MORA_INICIAL_PRODUCTO"));
        deudor.setDiasDeSobregiro(resultSet.getInt("DIAS_DE_SOBREGIRO"));
        deudor.setDiasMoraPesos(resultSet.getInt("DIAS_MORA_PESOS"));
        deudor.setRangoPorMoraInicialProducto(resultSet.getInt("RANGO_POR_MORA_INICIAL_PRODUCTO"));
        deudor.setExposicionPorMoraCliente(resultSet.getString("EXPOSICION_POR_MORA_CLIENTE"));
        deudor.setMacroportafolioCliente(resultSet.getString("MACROPORTAFOLIO_CLIENTE"));
        deudor.setMacro(resultSet.getString("MACRO"));
        deudor.setMacroproducto(resultSet.getString("MACROPRODUCTO"));
        deudor.setMarcacion(resultSet.getString("MARCACION"));
        deudor.setMarcacionB(resultSet.getString("MARCACION_B"));
        deudor.setEstado(resultSet.getString("ESTADO"));
        deudor.setProducto(resultSet.getString("PRODUCTO"));
        deudor.setSubproducto(resultSet.getString("SUBPRODUCTO"));
        deudor.setCodProducto(resultSet.getString("COD_PRODUCTO"));
        deudor.setDescripcionProducto(resultSet.getString("DESCRIPCION_PRODUCTO"));
        deudor.setRegionalCliente(resultSet.getString("REGIONAL_CLIENTE"));
        deudor.setSucursalCliente(resultSet.getString("SUCURSAL_CLIENTE"));
        deudor.setCodOficinaCl(resultSet.getInt("COD_OFICINA_CL"));
        deudor.setRegionalPd(resultSet.getString("REGIONAL_PD"));
        deudor.setSucursalPd(resultSet.getString("SUCURSAL_PD"));
        deudor.setCodOficinaPd(resultSet.getInt("COD_OFICINA_PD"));
        deudor.setFechaDeApertura(resultSet.getString("FECHA_DE_APERTURA"));
        deudor.setValorOriginalOCupo(resultSet.getInt("VALOR_ORIGINAL_O_CUPO"));
        deudor.setCupoConsumo(resultSet.getInt("CUPO_CONSUMO"));
        deudor.setSaldoTotalProducto(resultSet.getInt("SALDO_TOTAL_PRODUCTO"));
        deudor.setSaldoTotalCliente(resultSet.getInt("SALDO_TOTAL_CLIENTE"));
        deudor.setSaldoCapitalProducto(resultSet.getInt("SALDO_CAPITAL_PRODUCTO"));
        deudor.setIntCteProducto(resultSet.getInt("INT_CTE_PRODUCTO"));
        deudor.setSaldoSegurosProd(resultSet.getFloat("SALDO_SEGUROS_PROD"));
        deudor.setSegurosMesProducto(resultSet.getInt("SEGUROS_MES_PRODUCTO"));
        deudor.setIntDeMoraProducto(resultSet.getInt("INT_DE_MORA_PRODUCTO"));
        deudor.setSaldoProdUvr(resultSet.getFloat("SALDO_PROD_UVR"));
        deudor.setSaldoNegociacionProducto(resultSet.getInt("SALDO_NEGOCIACION_PRODUCTO"));
        deudor.setFechaLimiteDePago(resultSet.getString("FECHA_LIMITE_DE_PAGO"));
        deudor.setDiaDePago(resultSet.getInt("DIA_DE_PAGO"));
        deudor.setCicloDePago(resultSet.getFloat("CICLO_DE_PAGO"));
        deudor.setVrCuotaProducto(resultSet.getInt("VR_CUOTA_PRODUCTO"));
        deudor.setPagoMinimoInicialProducto(resultSet.getInt("PAGO_MINIMO_INICIAL_PRODUCTO"));
        deudor.setSaldoEnMoraInicialProducto(resultSet.getInt("SALDO_EN_MORA_INICIAL_PRODUCTO"));
        deudor.setCupoCliente(resultSet.getInt("CUPO_CLIENTE"));
        deudor.setSldoCliente(resultSet.getInt("SLDO_CLIENTE"));
        deudor.setSaldoCapitalCliente(resultSet.getInt("SALDO_CAPITAL_CLIENTE"));
        deudor.setSldoMoraCliente(resultSet.getInt("SLDO_MORA_CLIENTE"));
        deudor.setPagoMinimoCliente(resultSet.getInt("PAGO_MINIMO_CLIENTE"));
        deudor.setSaldoMoraCliente(resultSet.getInt("SALDO_MORA_CLIENTE"));
        deudor.setFechaDeReestructuracion(resultSet.getString("FECHA_DE_REESTRUCTURACION"));
        deudor.setCantReestructuraciones(resultSet.getInt("CANT_REESTRUCTURACIONES"));
        deudor.setFechaDeCastigo(resultSet.getString("FECHA_DE_CASTIGO"));
        deudor.setRangoDeCastigo(resultSet.getString("RANGO_DE_CASTIGO"));
        deudor.setTasaDeInteres(resultSet.getFloat("TASA_DE_INTERES"));
        deudor.setCodPlanInteres(resultSet.getInt("COD_PLAN_INTERES"));
        deudor.setSistemaDeAmortizacion(resultSet.getInt("SISTEMA_DE_AMORTIZACION"));
        deudor.setDescripcionConvenioCliente(resultSet.getInt("DESCRIPCION_CONVENIO_CLIENTE"));
        deudor.setConvenioProducto(resultSet.getInt("CONVENIO_PRODUCTO"));
        deudor.setIdentificacionAmparado(resultSet.getInt("IDENTIFICACION_AMPARADO"));
        deudor.setTarjAmparadora(resultSet.getInt("TARJ_AMPARADORA"));
        deudor.setPlazo(resultSet.getInt("PLAZO"));
        deudor.setPlazoRestante(resultSet.getInt("PLAZO_RESTANTE"));
        deudor.setEstadoCliente(resultSet.getInt("ESTADO_CLIENTE"));
        deudor.setSegmentoBuk(resultSet.getInt("SEGMENTO_BUK"));
        deudor.setSubsegmentoBuk(resultSet.getInt("SUBSEGMENTO_BUK"));
        deudor.setConvenioTarjeta(resultSet.getString("CONVENIO_TARJETA"));
        deudor.setSegmento(resultSet.getString("SEGMENTO"));
        deudor.setAgenteVendedor(resultSet.getInt("AGENTE_VENDEDOR"));
        deudor.setRiesgoDavivienda(resultSet.getFloat("RIESGO_DAVIVIENDA"));
        deudor.setIsfCliente(resultSet.getString("ISF_CLIENTE"));
        deudor.setMejorMotivoNoPago(resultSet.getString("MEJOR_MOTIVO_NO_PAGO"));
        deudor.setMejorGestion(resultSet.getString("MEJOR_GESTION"));
        deudor.setPrioridad(resultSet.getFloat("PRIORIDAD"));
        deudor.setGestionEnero(resultSet.getString("GESTION_ENERO"));
        deudor.setGestionFebrero(resultSet.getString("GESTION_FEBRERO"));
        deudor.setGestionMarzo(resultSet.getString("GESTION_MARZO"));
        deudor.setGestionAbril(resultSet.getString("GESTION_ABRIL"));
        deudor.setContactabilidad(resultSet.getString("CONTACTABILIDAD"));
        deudor.setPagosEnero(resultSet.getInt("PAGOS_ENERO"));
        deudor.setPagosFebrero(resultSet.getInt("PAGOS_FEBRERO"));
        deudor.setPagosMarzo(resultSet.getInt("PAGOS_MARZO"));
        deudor.setPagosAbril(resultSet.getInt("PAGOS_ABRIL"));
        deudor.setNovedadCliente(resultSet.getString("NOVEDAD_CLIENTE"));
        deudor.setResultadoClienteEnero(resultSet.getString("RESULTADO_CLIENTE_ENERO"));
        deudor.setResultadoClienteFebrero(resultSet.getString("RESULTADO_CLIENTE_FEBRERO"));
        deudor.setResultadoClienteMarzo(resultSet.getString("RESULTADO_CLIENTE_MARZO"));
        deudor.setResultadoClienteAbril(resultSet.getString("RESULTADO_CLIENTE_ABRIL"));
        deudor.setCaldas(resultSet.getInt("CALDAS"));
        deudor.setSoacha(resultSet.getInt("SOACHA"));
        deudor.setSaravena(resultSet.getInt("SARAVENA"));
        deudor.setLaVega(resultSet.getInt("LA_VEGA"));
        deudor.setGirardot(resultSet.getInt("GIRARDOT"));
        deudor.setMalambo(resultSet.getInt("MALAMBO"));
        deudor.setTunja(resultSet.getInt("TUNJA"));
        deudor.setTulua(resultSet.getInt("TULUA"));
        deudor.setZarzal(resultSet.getInt("ZARZAL"));
        deudor.setSantafeDeAntioquia(resultSet.getInt("SANTAFE_DE_ANTIOQUIA"));
        deudor.setVillaDelRosario(resultSet.getInt("VILLA_DEL_ROSARIO"));
        deudor.setDuitama(resultSet.getInt("DUITAMA"));
        deudor.setSanJuanDelCesar(resultSet.getInt("SAN_JUAN_DEL_CESAR"));
        deudor.setNimaima(resultSet.getInt("NIMAIMA"));
        deudor.setTurbo(resultSet.getInt("TURBO"));
        deudor.setSanCalixto(resultSet.getInt("SAN_CALIXTO"));
        deudor.setSogamoso(resultSet.getInt("SOGAMOSO"));
        deudor.setVillaRica(resultSet.getInt("VILLA_RICA"));
        deudor.setGuarne(resultSet.getInt("GUARNE"));
        deudor.setCopacabana(resultSet.getInt("COPACABANA"));
        deudor.setElRosal(resultSet.getInt("EL_ROSAL"));
        deudor.setYumbo(resultSet.getInt("YUMBO"));
        deudor.setMonteria(resultSet.getInt("MONTERIA"));
        deudor.setBocachica(resultSet.getInt("BOCACHICA"));
        deudor.setGuacheta(resultSet.getInt("GUACHETA"));
        deudor.setMariaLaBaja(resultSet.getInt("MARIA_LA_BAJA"));
        deudor.setApartado(resultSet.getInt("APARTADO"));
        deudor.setUne(resultSet.getInt("UNE"));
        deudor.setCartagenaDeIndias(resultSet.getInt("CARTAGENA_DE_INDIAS"));
        deudor.setBarrancabermeja(resultSet.getInt("BARRANCABERMEJA"));
        deudor.setLaDorada(resultSet.getInt("LA_DORADA"));
        deudor.setHonda(resultSet.getInt("HONDA"));
        deudor.setJamundi(resultSet.getInt("JAMUNDI"));
        deudor.setSucre(resultSet.getInt("SUCRE"));
        deudor.setFiladelfia(resultSet.getInt("FILADELFIA"));
        deudor.setSanMateo(resultSet.getInt("SAN_MATEO"));
        deudor.setVillanueva(resultSet.getInt("VILLANUEVA"));
        deudor.setPurificacion(resultSet.getInt("PURIFICACION"));
        deudor.setOcana(resultSet.getInt("OCANA"));
        deudor.setFloridablanca(resultSet.getInt("FLORIDABLANCA"));
        deudor.setNocaima(resultSet.getInt("NOCAIMA"));
        deudor.setLaTebaida(resultSet.getInt("LA_TEBAIDA"));
        deudor.setChacua(resultSet.getInt("CHACUA"));
        deudor.setRioblanco(resultSet.getInt("RIOBLANCO"));
        deudor.setLaCalera(resultSet.getInt("LA_CALERA"));
        deudor.setUbate(resultSet.getInt("UBATE"));
        deudor.setRemedios(resultSet.getInt("REMEDIOS"));
        deudor.setMarinilla(resultSet.getInt("MARINILLA"));
        deudor.setUbala(resultSet.getInt("UBALA"));
        deudor.setElCarmenDeViboral(resultSet.getInt("EL_CARMEN_DE_VIBORAL"));
        deudor.setFacatativa(resultSet.getInt("FACATATIVA"));
        deudor.setNeiva(resultSet.getInt("NEIVA"));
        deudor.setSantiagoDeCali(resultSet.getInt("SANTIAGO_DE_CALI"));
        deudor.setKilometro30(resultSet.getInt("KILOMETRO_30"));
        deudor.setCalibio(resultSet.getInt("CALIBIO"));
        deudor.setChiquinquira(resultSet.getInt("CHIQUINQUIRA"));
        deudor.setTena(resultSet.getInt("TENA"));
        deudor.setColombia(resultSet.getInt("COLOMBIA"));
        deudor.setSantaRosaDeCabal(resultSet.getInt("SANTA_ROSA_DE_CABAL"));
        deudor.setMedellin(resultSet.getInt("MEDELLIN"));
        deudor.setSanJuanDeSumapaz(resultSet.getInt("SAN_JUAN_DE_SUMAPAZ"));
        deudor.setArmenia(resultSet.getInt("ARMENIA"));
        deudor.setSibate(resultSet.getInt("SIBATE"));
        deudor.setGarzon(resultSet.getInt("GARZON"));
        deudor.setSanAlberto(resultSet.getInt("SAN_ALBERTO"));
        deudor.setPopayan(resultSet.getInt("POPAYAN"));
        deudor.setGirardota(resultSet.getInt("GIRARDOTA"));
        deudor.setGacheta(resultSet.getInt("GACHETA"));
        deudor.setGiron(resultSet.getInt("GIRON"));
        deudor.setGuayabalDeSiquima(resultSet.getInt("GUAYABAL_DE_SIQUIMA"));
        deudor.setSopo(resultSet.getInt("SOPO"));
        deudor.setSanAndres(resultSet.getInt("SAN_ANDRES"));
        deudor.setTurbaco(resultSet.getInt("TURBACO"));
        deudor.setVillapinzon(resultSet.getInt("VILLAPINZON"));
        deudor.setChia(resultSet.getInt("CHIA"));
        deudor.setSantaFe(resultSet.getInt("SANTA_FE"));
        deudor.setNemocon(resultSet.getInt("NEMOCON"));
        deudor.setBoavita(resultSet.getInt("BOAVITA"));
        deudor.setCerete(resultSet.getInt("CERETE"));
        deudor.setAguazul(resultSet.getInt("AGUAZUL"));
        deudor.setSantanderDeQuilichao(resultSet.getInt("SANTANDER_DE_QUILICHAO"));
        deudor.setLaEstrella(resultSet.getInt("LA_ESTRELLA"));
        deudor.setEspinal(resultSet.getInt("ESPINAL"));
        deudor.setMariquita(resultSet.getInt("MARIQUITA"));
        deudor.setSincelejo(resultSet.getInt("SINCELEJO"));
        deudor.setCienagaDeOro(resultSet.getInt("CIENAGA_DE_ORO"));
        deudor.setBarrancas(resultSet.getInt("BARRANCAS"));
        deudor.setRiosucio(resultSet.getInt("RIOSUCIO"));
        deudor.setArara(resultSet.getInt("ARARA"));
        deudor.setSanJoseDelGuaviare(resultSet.getInt("SAN_JOSE_DEL_GUAVIARE"));
        deudor.setTocancipa(resultSet.getInt("TOCANCIPA"));
        deudor.setSabanaDeTorres(resultSet.getInt("SABANA_DE_TORRES"));
        deudor.setSanFranciscoDeQuibdo(resultSet.getInt("SAN_FRANCISCO_DE_QUIBDO"));
        deudor.setGuasca(resultSet.getInt("GUASCA"));
        deudor.setGuaduas(resultSet.getInt("GUADUAS"));
        deudor.setQuimbaya(resultSet.getInt("QUIMBAYA"));
        deudor.setArauca(resultSet.getInt("ARAUCA"));
        deudor.setPuertoBogota(resultSet.getInt("PUERTO_BOGOTA"));
        deudor.setGachancipa(resultSet.getInt("GACHANCIPA"));
        deudor.setBucaramanga(resultSet.getInt("BUCARAMANGA"));
        deudor.setGuanegro(resultSet.getInt("GUANEGRO"));
        deudor.setPenol(resultSet.getInt("PENOL"));
        deudor.setGalapa(resultSet.getInt("GALAPA"));
        deudor.setPalmira(resultSet.getInt("PALMIRA"));
        deudor.setPacho(resultSet.getInt("PACHO"));
        deudor.setSilvania(resultSet.getInt("SILVANIA"));
        deudor.setEnvigado(resultSet.getInt("ENVIGADO"));
        deudor.setSanJuanDeRioSeco(resultSet.getInt("SAN_JUAN_DE_RIO_SECO"));
        deudor.setVillamaria(resultSet.getInt("VILLAMARIA"));
        deudor.setAmaga(resultSet.getInt("AMAGA"));
        deudor.setTauramena(resultSet.getInt("TAURAMENA"));
        deudor.setAguaDeDios(resultSet.getInt("AGUA_DE_DIOS"));
        deudor.setMadrid(resultSet.getInt("MADRID"));
        deudor.setAlvarado(resultSet.getInt("ALVARADO"));
        deudor.setDosquebradas(resultSet.getInt("DOSQUEBRADAS"));
        deudor.setSasaima(resultSet.getInt("SASAIMA"));
        deudor.setAguachica(resultSet.getInt("AGUACHICA"));
        deudor.setRionegro(resultSet.getInt("RIONEGRO"));
        deudor.setOrtega(resultSet.getInt("ORTEGA"));
        deudor.setCajica(resultSet.getInt("CAJICA"));
        deudor.setLaUnion(resultSet.getInt("LA_UNION"));
        deudor.setVillaDeLeyva(resultSet.getInt("VILLA_DE_LEYVA"));
        deudor.setSabaneta(resultSet.getInt("SABANETA"));
        deudor.setLosPatios(resultSet.getInt("LOS_PATIOS"));
        deudor.setDarien(resultSet.getInt("DARIEN"));
        deudor.setTenjo(resultSet.getInt("TENJO"));
        deudor.setManizales(resultSet.getInt("MANIZALES"));
        deudor.setPuertoColombia(resultSet.getInt("PUERTO_COLOMBIA"));
        deudor.setElPenol(resultSet.getInt("EL_PENOL"));
        deudor.setVillavicencio(resultSet.getInt("VILLAVICENCIO"));
        deudor.setIpiales(resultSet.getInt("IPIALES"));
        deudor.setValparaiso(resultSet.getInt("VALPARAISO"));
        deudor.setLebrija(resultSet.getInt("LEBRIJA"));
        deudor.setOporapa(resultSet.getInt("OPORAPA"));
        deudor.setCogua(resultSet.getInt("COGUA"));
        deudor.setYopal(resultSet.getInt("YOPAL"));
        deudor.setCorozal(resultSet.getInt("COROZAL"));
        deudor.setValledupar(resultSet.getInt("VALLEDUPAR"));
        deudor.setGranada(resultSet.getInt("GRANADA"));
        deudor.setPivijay(resultSet.getInt("PIVIJAY"));
        deudor.setFunza(resultSet.getInt("FUNZA"));
        deudor.setCota(resultSet.getInt("COTA"));
        deudor.setSanJose(resultSet.getInt("SAN_JOSE"));
        deudor.setAnacletoGarcia(resultSet.getInt("ANACLETO_GARCIA"));
        deudor.setTumaco(resultSet.getInt("TUMACO"));
        deudor.setTabio(resultSet.getInt("TABIO"));
        deudor.setVilleta(resultSet.getInt("VILLETA"));
        deudor.setZipaquira(resultSet.getInt("ZIPAQUIRA"));
        deudor.setAnapoima(resultSet.getInt("ANAPOIMA"));
        deudor.setAgrado(resultSet.getInt("AGRADO"));
        deudor.setQuetame(resultSet.getInt("QUETAME"));
        deudor.setCartago(resultSet.getInt("CARTAGO"));
        deudor.setBarranquilla(resultSet.getInt("BARRANQUILLA"));
        deudor.setCaguan(resultSet.getInt("CAGUAN"));
        deudor.setAmbalema(resultSet.getInt("AMBALEMA"));
        deudor.setFusagasuga(resultSet.getInt("FUSAGASUGA"));
        deudor.setNatagaima(resultSet.getInt("NATAGAIMA"));
        deudor.setVillagomez(resultSet.getInt("VILLAGOMEZ"));
        deudor.setSandona(resultSet.getInt("SANDONA"));
        deudor.setSanJuanDePasto(resultSet.getInt("SAN_JUAN_DE_PASTO"));
        deudor.setMelgar(resultSet.getInt("MELGAR"));
        deudor.setBello(resultSet.getInt("BELLO"));
        deudor.setBosconia(resultSet.getInt("BOSCONIA"));
        deudor.setRafaelReyes(resultSet.getInt("RAFAEL_REYES"));
        deudor.setFlorencia(resultSet.getInt("FLORENCIA"));
        deudor.setTarapaca(resultSet.getInt("TARAPACA"));
        deudor.setViani(resultSet.getInt("VIANI"));
        deudor.setSantaMarta(resultSet.getInt("SANTA_MARTA"));
        deudor.setBarrancaDeUpia(resultSet.getInt("BARRANCA_DE_UPIA"));
        deudor.setBituima(resultSet.getInt("BITUIMA"));
        deudor.setBogotaDc(resultSet.getInt("BOGOTA_DC"));
        deudor.setItagui(resultSet.getInt("ITAGUI"));
        deudor.setLaMesa(resultSet.getInt("LA_MESA"));
        deudor.setTibu(resultSet.getInt("TIBU"));
        deudor.setSoledad(resultSet.getInt("SOLEDAD"));
        deudor.setSalamina(resultSet.getInt("SALAMINA"));
        deudor.setCarmenDeCarupa(resultSet.getInt("CARMEN_DE_CARUPA"));
        deudor.setCaucasia(resultSet.getInt("CAUCASIA"));
        deudor.setPitalito(resultSet.getInt("PITALITO"));
        deudor.setTesalia(resultSet.getInt("TESALIA"));
        deudor.setMagangue(resultSet.getInt("MAGANGUE"));
        deudor.setSanCarlos(resultSet.getInt("SAN_CARLOS"));
        deudor.setIbague(resultSet.getInt("IBAGUE"));
        deudor.setSocorro(resultSet.getInt("SOCORRO"));
        deudor.setGuayabetal(resultSet.getInt("GUAYABETAL"));
        deudor.setPereira(resultSet.getInt("PEREIRA"));
        deudor.setCienaga(resultSet.getInt("CIENAGA"));
        deudor.setPiedecuesta(resultSet.getInt("PIEDECUESTA"));
        deudor.setPuertoAsis(resultSet.getInt("PUERTO_ASIS"));
        deudor.setCaqueza(resultSet.getInt("CAQUEZA"));
        deudor.setMompos(resultSet.getInt("MOMPOS"));
        deudor.setMosquera(resultSet.getInt("MOSQUERA"));
        deudor.setCucuta(resultSet.getInt("CUCUTA"));
        deudor.setRiohacha(resultSet.getInt("RIOHACHA"));
        deudor.setCaicedonia(resultSet.getInt("CAICEDONIA"));
        deudor.setLibano(resultSet.getInt("LIBANO"));
        deudor.setGuamal(resultSet.getInt("GUAMAL"));
        deudor.setElColegio(resultSet.getInt("EL_COLEGIO"));
        deudor.setBaranoa(resultSet.getInt("BARANOA"));
        deudor.setSubachoque(resultSet.getInt("SUBACHOQUE"));
        deudor.setSanGil(resultSet.getInt("SAN_GIL"));
        deudor.setFlandes(resultSet.getInt("FLANDES"));
        deudor.setAbejorral(resultSet.getInt("ABEJORRAL"));
        deudor.setPalermo(resultSet.getInt("PALERMO"));
        deudor.setCalarca(resultSet.getInt("CALARCA"));
        deudor.setSanBernardoDelViento(resultSet.getInt("SAN_BERNARDO_DEL_VIENTO"));
        deudor.setAcacias(resultSet.getInt("ACACIAS"));
        deudor.setCordoba(resultSet.getInt("CORDOBA"));
        deudor.setParam300(resultSet.getFloat("PARAM_300"));
        deudor.setTipoTel1(resultSet.getInt("tipo_tel1"));
        deudor.setTipoTel2(resultSet.getInt("tipo_tel2"));
        deudor.setTipoTel3(resultSet.getInt("tipo_tel3"));
        deudor.setTipoTel5(resultSet.getInt("tipo_tel5"));
        deudor.setTipoTel6(resultSet.getInt("tipo_tel6"));
        deudor.setTipoTel9(resultSet.getInt("tipo_tel9"));
        deudor.setMocoaDir(resultSet.getInt("MOCOA_dir"));
        deudor.setBarranquillaDir(resultSet.getInt("BARRANQUILLA_dir"));
        deudor.setBerruecosDir(resultSet.getInt("BERRUECOS_dir"));
        deudor.setTarapacaDir(resultSet.getInt("TARAPACA_dir"));
        deudor.setLosPatiosDir(resultSet.getInt("LOS_PATIOS_dir"));
        deudor.setUbalaDir(resultSet.getInt("UBALA_dir"));
        deudor.setLaTebaidaDir(resultSet.getInt("LA_TEBAIDA_dir"));
        deudor.setPuntaDePiedrasDir(resultSet.getInt("PUNTA_DE_PIEDRAS_dir"));
        deudor.setChivoloDir(resultSet.getInt("CHIVOLO_dir"));
        deudor.setCoguaDir(resultSet.getInt("COGUA_dir"));
        deudor.setPedrazaDir(resultSet.getInt("PEDRAZA_dir"));
        deudor.setMarquetaliaDir(resultSet.getInt("MARQUETALIA_dir"));
        deudor.setSanAntonioDeTequendamaDir(resultSet.getInt("SAN_ANTONIO_DE_TEQUENDAMA_dir"));
        deudor.setZipaquiraDir(resultSet.getInt("ZIPAQUIRA_dir"));
        deudor.setCaguanDir(resultSet.getInt("CAGUAN_dir"));
        deudor.setAmbalemaDir(resultSet.getInt("AMBALEMA_dir"));
        deudor.setVillaDeLeyvaDir(resultSet.getInt("VILLA_DE_LEYVA_dir"));
        deudor.setSanVicenteDir(resultSet.getInt("SAN_VICENTE_dir"));
        deudor.setMarinillaDir(resultSet.getInt("MARINILLA_dir"));
        deudor.setHatonuevoDir(resultSet.getInt("HATONUEVO_dir"));
        deudor.setSubachoqueDir(resultSet.getInt("SUBACHOQUE_dir"));
        deudor.setValleduparDir(resultSet.getInt("VALLEDUPAR_dir"));
        deudor.setSabanaDeTorresDir(resultSet.getInt("SABANA_DE_TORRES_dir"));
        deudor.setAcapulcoDir(resultSet.getInt("ACAPULCO_dir"));
        deudor.setSanJoseCalabazalDir(resultSet.getInt("SAN_JOSE_CALABAZAL_dir"));
        deudor.setSantiagoDeCaliDir(resultSet.getInt("SANTIAGO_DE_CALI_dir"));
        deudor.setPuertoGaitanDir(resultSet.getInt("PUERTO_GAITAN_dir"));
        deudor.setFlandesDir(resultSet.getInt("FLANDES_dir"));
        deudor.setSanVicenteChucuriDir(resultSet.getInt("SAN_VICENTE_CHUCURI_dir"));
        deudor.setRiohachaDir(resultSet.getInt("RIOHACHA_dir"));
        deudor.setSantanderDeQuilichaoDir(resultSet.getInt("SANTANDER_DE_QUILICHAO_dir"));
        deudor.setOrtegaDir(resultSet.getInt("ORTEGA_dir"));
        deudor.setCienagaDir(resultSet.getInt("CIENAGA_dir"));
        deudor.setItaguiDir(resultSet.getInt("ITAGUI_dir"));
        deudor.setFloridablancaDir(resultSet.getInt("FLORIDABLANCA_dir"));
        deudor.setSanJuanDelCesarDir(resultSet.getInt("SAN_JUAN_DEL_CESAR_dir"));
        deudor.setTabioDir(resultSet.getInt("TABIO_dir"));
        deudor.setProvidenciaDir(resultSet.getInt("PROVIDENCIA_dir"));
        deudor.setOcanaDir(resultSet.getInt("OCANA_dir"));
        deudor.setElPenolDir(resultSet.getInt("EL_PENOL_dir"));
        deudor.setQuimbayaDir(resultSet.getInt("QUIMBAYA_dir"));
        deudor.setAguazulDir(resultSet.getInt("AGUAZUL_dir"));
        deudor.setFacatativaDir(resultSet.getInt("FACATATIVA_dir"));
        deudor.setUbateDir(resultSet.getInt("UBATE_dir"));
        deudor.setLaHormigaDir(resultSet.getInt("LA_HORMIGA_dir"));
        deudor.setGuacamayalDir(resultSet.getInt("GUACAMAYAL_dir"));
        deudor.setPalestinaDir(resultSet.getInt("PALESTINA_dir"));
        deudor.setCorozalDir(resultSet.getInt("COROZAL_dir"));
        deudor.setCucutaDir(resultSet.getInt("CUCUTA_dir"));
        deudor.setTocancipaDir(resultSet.getInt("TOCANCIPA_dir"));
        deudor.setLaPalmaDir(resultSet.getInt("LA_PALMA_dir"));
        deudor.setDuitamaDir(resultSet.getInt("DUITAMA_dir"));
        deudor.setLibanoDir(resultSet.getInt("LIBANO_dir"));
        deudor.setGenovaDir(resultSet.getInt("GENOVA_dir"));
        deudor.setAracatacaDir(resultSet.getInt("ARACATACA_dir"));
        deudor.setBarrioMedellinDir(resultSet.getInt("BARRIO_MEDELLIN_dir"));
        deudor.setVillamariaDir(resultSet.getInt("VILLAMARIA_dir"));
        deudor.setCaicedoniaDir(resultSet.getInt("CAICEDONIA_dir"));
        deudor.setCartagenaDeIndiasDir(resultSet.getInt("CARTAGENA_DE_INDIAS_dir"));
        deudor.setEnvigadoDir(resultSet.getInt("ENVIGADO_dir"));
        deudor.setTunjaDir(resultSet.getInt("TUNJA_dir"));
        deudor.setBagadoDir(resultSet.getInt("BAGADO_dir"));
        deudor.setLoricaDir(resultSet.getInt("LORICA_dir"));
        deudor.setSanBernardoDelVientoDir(resultSet.getInt("SAN_BERNARDO_DEL_VIENTO_dir"));
        deudor.setSibateDir(resultSet.getInt("SIBATE_dir"));
        deudor.setGirardotDir(resultSet.getInt("GIRARDOT_dir"));
        deudor.setAguaDeDiosDir(resultSet.getInt("AGUA_DE_DIOS_dir"));
        deudor.setSuescaDir(resultSet.getInt("SUESCA_dir"));
        deudor.setMaicaoDir(resultSet.getInt("MAICAO_dir"));
        deudor.setElCarmenDeBolivarDir(resultSet.getInt("EL_CARMEN_DE_BOLIVAR_dir"));
        deudor.setPopayanDir(resultSet.getInt("POPAYAN_dir"));
        deudor.setAguachicaDir(resultSet.getInt("AGUACHICA_dir"));
        deudor.setAcaciasDir(resultSet.getInt("ACACIAS_dir"));
        deudor.setVillavicencioDir(resultSet.getInt("VILLAVICENCIO_dir"));
        deudor.setFusagasugaDir(resultSet.getInt("FUSAGASUGA_dir"));
        deudor.setLaUnionDir(resultSet.getInt("LA_UNION_dir"));
        deudor.setSilvaniaDir(resultSet.getInt("SILVANIA_dir"));
        deudor.setSantaRosaDeCabalDir(resultSet.getInt("SANTA_ROSA_DE_CABAL_dir"));
        deudor.setFundacionDir(resultSet.getInt("FUNDACION_dir"));
        deudor.setArmeniaDir(resultSet.getInt("ARMENIA_dir"));
        deudor.setCaquezaDir(resultSet.getInt("CAQUEZA_dir"));
        deudor.setLaLagunaDir(resultSet.getInt("LA_LAGUNA_dir"));
        deudor.setTurbacoDir(resultSet.getInt("TURBACO_dir"));
        deudor.setTuluaDir(resultSet.getInt("TULUA_dir"));
        deudor.setDabeibaDir(resultSet.getInt("DABEIBA_dir"));
        deudor.setChiriguanaDir(resultSet.getInt("CHIRIGUANA_dir"));
        deudor.setPitalitoDir(resultSet.getInt("PITALITO_dir"));
        deudor.setGuascaDir(resultSet.getInt("GUASCA_dir"));
        deudor.setAcoDir(resultSet.getInt("ACO_dir"));
        deudor.setCotaDir(resultSet.getInt("COTA_dir"));
        deudor.setMosqueraDir(resultSet.getInt("MOSQUERA_dir"));
        deudor.setGarzonDir(resultSet.getInt("GARZON_dir"));
        deudor.setRiosucioDir(resultSet.getInt("RIOSUCIO_dir"));
        deudor.setBijagualDir(resultSet.getInt("BIJAGUAL_dir"));
        deudor.setTubaraDir(resultSet.getInt("TUBARA_dir"));
        deudor.setSanCarlosDir(resultSet.getInt("SAN_CARLOS_dir"));
        deudor.setLaCaleraDir(resultSet.getInt("LA_CALERA_dir"));
        deudor.setAlgecirasDir(resultSet.getInt("ALGECIRAS_dir"));
        deudor.setHoboDir(resultSet.getInt("HOBO_dir"));
        deudor.setCienagaDeOroDir(resultSet.getInt("CIENAGA_DE_ORO_dir"));
        deudor.setGuadalupeDir(resultSet.getInt("GUADALUPE_dir"));
        deudor.setLaVegaDir(resultSet.getInt("LA_VEGA_dir"));
        deudor.setLaMesaDir(resultSet.getInt("LA_MESA_dir"));
        deudor.setPuertoAsisDir(resultSet.getInt("PUERTO_ASIS_dir"));
        deudor.setFunzaDir(resultSet.getInt("FUNZA_dir"));
        deudor.setMedellinDir(resultSet.getInt("MEDELLIN_dir"));
        deudor.setBaranoaDir(resultSet.getInt("BARANOA_dir"));
        deudor.setTumacoDir(resultSet.getInt("TUMACO_dir"));
        deudor.setElCastilloDir(resultSet.getInt("EL_CASTILLO_dir"));
        deudor.setAguadasDir(resultSet.getInt("AGUADAS_dir"));
        deudor.setCaldasDir(resultSet.getInt("CALDAS_dir"));
        deudor.setBarrancabermejaDir(resultSet.getInt("BARRANCABERMEJA_dir"));
        deudor.setAraucaDir(resultSet.getInt("ARAUCA_dir"));
        deudor.setGuatavitaDir(resultSet.getInt("GUATAVITA_dir"));
        deudor.setAngosturaDir(resultSet.getInt("ANGOSTURA_dir"));
        deudor.setGuayabetalDir(resultSet.getInt("GUAYABETAL_dir"));
        deudor.setEspinalDir(resultSet.getInt("ESPINAL_dir"));
        deudor.setSantiagoDir(resultSet.getInt("SANTIAGO_dir"));
        deudor.setRionegroDir(resultSet.getInt("RIONEGRO_dir"));
        deudor.setAbregoDir(resultSet.getInt("ABREGO_dir"));
        deudor.setVillagarzonDir(resultSet.getInt("VILLAGARZON_dir"));
        deudor.setNemoconDir(resultSet.getInt("NEMOCON_dir"));
        deudor.setPalermoDir(resultSet.getInt("PALERMO_dir"));
        deudor.setTibuDir(resultSet.getInt("TIBU_dir"));
        deudor.setHondaDir(resultSet.getInt("HONDA_dir"));
        deudor.setVillaRicaDir(resultSet.getInt("VILLA_RICA_dir"));
        deudor.setRicaurteDir(resultSet.getInt("RICAURTE_dir"));
        deudor.setPivijayDir(resultSet.getInt("PIVIJAY_dir"));
        deudor.setUribiaDir(resultSet.getInt("URIBIA_dir"));
        deudor.setGuanegroDir(resultSet.getInt("GUANEGRO_dir"));
        deudor.setSantaMartaDir(resultSet.getInt("SANTA_MARTA_dir"));
        deudor.setColombiaDir(resultSet.getInt("COLOMBIA_dir"));
        deudor.setCarepaDir(resultSet.getInt("CAREPA_dir"));
        deudor.setGironDir(resultSet.getInt("GIRON_dir"));
        deudor.setSasaimaDir(resultSet.getInt("SASAIMA_dir"));
        deudor.setBajoTablazoDir(resultSet.getInt("BAJO_TABLAZO_dir"));
        deudor.setSoledadDir(resultSet.getInt("SOLEDAD_dir"));
        deudor.setJamundiDir(resultSet.getInt("JAMUNDI_dir"));
        deudor.setChiquinquiraDir(resultSet.getInt("CHIQUINQUIRA_dir"));
        deudor.setYopalDir(resultSet.getInt("YOPAL_dir"));
        deudor.setLaDoradaDir(resultSet.getInt("LA_DORADA_dir"));
        deudor.setElPasoDir(resultSet.getInt("EL_PASO_dir"));
        deudor.setVillaDelRosarioDir(resultSet.getInt("VILLA_DEL_ROSARIO_dir"));
        deudor.setMonteriaDir(resultSet.getInt("MONTERIA_dir"));
        deudor.setZarzalDir(resultSet.getInt("ZARZAL_dir"));
        deudor.setCampoalegreDir(resultSet.getInt("CAMPOALEGRE_dir"));
        deudor.setGachetaDir(resultSet.getInt("GACHETA_dir"));
        deudor.setBuenaventuraDir(resultSet.getInt("BUENAVENTURA_dir"));
        deudor.setChaparralDir(resultSet.getInt("CHAPARRAL_dir"));
        deudor.setMoniquiraDir(resultSet.getInt("MONIQUIRA_dir"));
        deudor.setChiaDir(resultSet.getInt("CHIA_dir"));
        deudor.setGuaduasDir(resultSet.getInt("GUADUAS_dir"));
        deudor.setAbejorralDir(resultSet.getInt("ABEJORRAL_dir"));
        deudor.setAnapoimaDir(resultSet.getInt("ANAPOIMA_dir"));
        deudor.setRafaelReyesDir(resultSet.getInt("RAFAEL_REYES_dir"));
        deudor.setGalapaDir(resultSet.getInt("GALAPA_dir"));
        deudor.setTenjoDir(resultSet.getInt("TENJO_dir"));
        deudor.setElRosalDir(resultSet.getInt("EL_ROSAL_dir"));
        deudor.setSaravenaDir(resultSet.getInt("SARAVENA_dir"));
        deudor.setLuruacoDir(resultSet.getInt("LURUACO_dir"));
        deudor.setQuetameDir(resultSet.getInt("QUETAME_dir"));
        deudor.setEstacionPereiraDir(resultSet.getInt("ESTACION_PEREIRA_dir"));
        deudor.setCopacabanaDir(resultSet.getInt("COPACABANA_dir"));
        deudor.setBelloDir(resultSet.getInt("BELLO_dir"));
        deudor.setOporapaDir(resultSet.getInt("OPORAPA_dir"));
        deudor.setTauramenaDir(resultSet.getInt("TAURAMENA_dir"));
        deudor.setSanGilDir(resultSet.getInt("SAN_GIL_dir"));
        deudor.setSabanetaDir(resultSet.getInt("SABANETA_dir"));
        deudor.setCartagoDir(resultSet.getInt("CARTAGO_dir"));
        deudor.setGachancipaDir(resultSet.getInt("GACHANCIPA_dir"));
        deudor.setCastillaDir(resultSet.getInt("CASTILLA_dir"));
        deudor.setSanJuanDePastoDir(resultSet.getInt("SAN_JUAN_DE_PASTO_dir"));
        deudor.setGuayabalDeSiquimaDir(resultSet.getInt("GUAYABAL_DE_SIQUIMA_dir"));
        deudor.setPachoDir(resultSet.getInt("PACHO_dir"));
        deudor.setBoavitaDir(resultSet.getInt("BOAVITA_dir"));
        deudor.setSogamosoDir(resultSet.getInt("SOGAMOSO_dir"));
        deudor.setMalamboDir(resultSet.getInt("MALAMBO_dir"));
        deudor.setSochaDir(resultSet.getInt("SOCHA_dir"));
        deudor.setPuertoColombiaDir(resultSet.getInt("PUERTO_COLOMBIA_dir"));
        deudor.setPalmiraDir(resultSet.getInt("PALMIRA_dir"));
        deudor.setSabanalargaDir(resultSet.getInt("SABANALARGA_dir"));
        deudor.setDosquebradasDir(resultSet.getInt("DOSQUEBRADAS_dir"));
        deudor.setSitionuevoDir(resultSet.getInt("SITIONUEVO_dir"));
        deudor.setSincelejoDir(resultSet.getInt("SINCELEJO_dir"));
        deudor.setPiedecuestaDir(resultSet.getInt("PIEDECUESTA_dir"));
        deudor.setMelgarDir(resultSet.getInt("MELGAR_dir"));
        deudor.setElColegioDir(resultSet.getInt("EL_COLEGIO_dir"));
        deudor.setBuenavistaDir(resultSet.getInt("BUENAVISTA_dir"));
        deudor.setVillarricaDir(resultSet.getInt("VILLARRICA_dir"));
        deudor.setAnsermanuevoDir(resultSet.getInt("ANSERMANUEVO_dir"));
        deudor.setNeivaDir(resultSet.getInt("NEIVA_dir"));
        deudor.setYolomboDir(resultSet.getInt("YOLOMBO_dir"));
        deudor.setBarrancasDir(resultSet.getInt("BARRANCAS_dir"));
        deudor.setFlorenciaDir(resultSet.getInt("FLORENCIA_dir"));
        deudor.setPalmarDeVarelaDir(resultSet.getInt("PALMAR_DE_VARELA_dir"));
        deudor.setSoachaDir(resultSet.getInt("SOACHA_dir"));
        deudor.setBucaramangaDir(resultSet.getInt("BUCARAMANGA_dir"));
        deudor.setGuarneDir(resultSet.getInt("GUARNE_dir"));
        deudor.setIbagueDir(resultSet.getInt("IBAGUE_dir"));
        deudor.setPereiraDir(resultSet.getInt("PEREIRA_dir"));
        deudor.setLaEstrellaDir(resultSet.getInt("LA_ESTRELLA_dir"));
        deudor.setMadridDir(resultSet.getInt("MADRID_dir"));
        deudor.setCajicaDir(resultSet.getInt("CAJICA_dir"));
        deudor.setUsiacuriDir(resultSet.getInt("USIACURI_dir"));
        deudor.setSabanagrandeDir(resultSet.getInt("SABANAGRANDE_dir"));
        deudor.setSopoDir(resultSet.getInt("SOPO_dir"));
        deudor.setNocaimaDir(resultSet.getInt("NOCAIMA_dir"));
        deudor.setVilletaDir(resultSet.getInt("VILLETA_dir"));
        deudor.setPurificacionDir(resultSet.getInt("PURIFICACION_dir"));
        deudor.setLaVirginiaDir(resultSet.getInt("LA_VIRGINIA_dir"));
        deudor.setBogotaDcDir(resultSet.getInt("BOGOTA_DC_dir"));
        deudor.setSantoTomasDir(resultSet.getInt("SANTO_TOMAS_dir"));
        deudor.setManizalesDir(resultSet.getInt("MANIZALES_dir"));
        deudor.setLaCejaDir(resultSet.getInt("LA_CEJA_dir"));
        deudor.setCabecitalDir(resultSet.getInt("CABECITAL_dir"));
        deudor.setNiloDir(resultSet.getInt("NILO_dir"));
        deudor.setIpialesDir(resultSet.getInt("IPIALES_dir"));
        deudor.setPinillosDir(resultSet.getInt("PINILLOS_dir"));
        deudor.setBetaniaDir(resultSet.getInt("BETANIA_dir"));
        deudor.setPlatoDir(resultSet.getInt("PLATO_dir"));
        deudor.setResidencia(resultSet.getFloat("RESIDENCIA"));
        deudor.setEmail(resultSet.getFloat("EMAIL"));
        deudor.setOtra(resultSet.getFloat("OTRA"));
        deudor.setTrabajo(resultSet.getFloat("TRABAJO"));
        deudor.setCorresp(resultSet.getFloat("CORRESP"));
        deudor.setTemporal(resultSet.getFloat("TEMPORAL"));
        deudor.setInmueble(resultSet.getFloat("INMUEBLE"));
        return deudor;
    }
}