package com.pe.polindustria.asistencia.services;

import com.pe.polindustria.asistencia.models.Response;
import com.pe.polindustria.asistencia.models.ViewPersonalOT;

import java.util.List;
import java.util.Map;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FieldMap;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface EnviaAsistenciaService {
    @GET("api/marcacion/registro")
    Call<Response<List<String>>> enviaAsistencia(
            @Query("personal") String personal,
            @Query("orden_trabajo") String orden_trabajo,
            @Query("usr") String usr,
            @Query("viatico") String viatico,
            @Query("obs") String obs);
}