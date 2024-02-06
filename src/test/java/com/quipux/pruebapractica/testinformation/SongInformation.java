package com.quipux.pruebapractica.testinformation;

import com.quipux.pruebapractica.dominio.dto.CancionDto;

public class SongInformation {
    public static final CancionDto GOOD_INFORMATION = new CancionDto(1,"Lluvia","Juanes","Lluvia","2022","Pop");
    public static final CancionDto BAD_INFORMATION_TITLE = new CancionDto(1,"","Juanes","Lluvia","2022","Pop");
    public static final CancionDto BAD_INFORMATION_ARTIST = new CancionDto(1,"Lluvia","","Lluvia","2022","Pop");
    public static final CancionDto BAD_INFORMATION_ALBUM = new CancionDto(1,"Lluvia","Juanes","","2022","Pop");
    public static final CancionDto BAD_INFORMATION_YEAR = new CancionDto(1,"Lluvia","Juanes","Lluvia","","Pop");
    public static final CancionDto BAD_INFORMATION_GENRE = new CancionDto(1,"Lluvia","Juanes","Lluvia","2022","");

}
