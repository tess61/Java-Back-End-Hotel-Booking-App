package com.tesfa.lakesidehotel.response;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data
public class BookeingResponse {
    private Long bookingId;
    private LocalDate checkInDate;
    private LocalDate checkOuDate;
    private String guestFullName;
    private String guestEmail;
    private int numberOfAdults;
    private int numberOfChildren;
    private int totalNumberOfGuest;
    private String bookingConformationCode;

    private RoomResponse room;

    public BookeingResponse(Long bookingId, LocalDate checkInDate, LocalDate checkOuDate,
                                String bookingConformationCode) {
        this.bookingId = bookingId;
        this.checkInDate = checkInDate;
        this.checkOuDate = checkOuDate;
        this.bookingConformationCode = bookingConformationCode;
    }

    

}
