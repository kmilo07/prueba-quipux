package com.quipux.pruebapractica.testinformation;

import com.quipux.pruebapractica.dominio.dto.CancionDto;

import java.util.List;

public class SongInformation {
    public static final CancionDto GOOD_INFORMATION = new CancionDto(1,"Lluvia","Juanes","Lluvia","2022","Pop");
    public static final CancionDto GOOD_INFORMATION2 = new CancionDto(2,"Nube","Juanes","Lluvia","2022","Pop");
    public static final CancionDto GOOD_INFORMATION3 = new CancionDto(3,"Trueno","Juanes","Lluvia","2022","Pop");
    public static final CancionDto BAD_INFORMATION_TITLE = new CancionDto(1,"","Juanes","Lluvia","2022","Pop");
    public static final CancionDto BAD_INFORMATION_ARTIST = new CancionDto(1,"Lluvia","","Lluvia","2022","Pop");
    public static final CancionDto BAD_INFORMATION_ALBUM = new CancionDto(1,"Lluvia","Juanes","","2022","Pop");
    public static final CancionDto BAD_INFORMATION_YEAR = new CancionDto(1,"Lluvia","Juanes","Lluvia","","Pop");
    public static final CancionDto BAD_INFORMATION_GENRE = new CancionDto(1,"Lluvia","Juanes","Lluvia","2022","");

    public static final List<CancionDto> GOOD_SONG_LIST_DTO = List.of(GOOD_INFORMATION,GOOD_INFORMATION2,GOOD_INFORMATION3);
    public static final List<CancionDto> BAD_SONG_LIST_DTO = List.of(GOOD_INFORMATION,GOOD_INFORMATION2,BAD_INFORMATION_TITLE);


}
