package com.bineo.app.utilities;

import com.bineo.app.enums.Values;
import lombok.SneakyThrows;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Calculate {

    private static final String REGEX = "\\p{Punct}";
    private static final String FORMAT_DATE = "dd MMMMM yyyy";

    private Calculate() {
    }

    public static String remainingPointsWithFormat(String points, String pointTicket, String amount) {
        DecimalFormat format = new DecimalFormat("###,###.##", DecimalFormatSymbols.getInstance(Locale.GERMANY));
        int amountPoints = Integer.parseInt(points.replaceAll(REGEX, ""));
        int ticketPoint = Integer.parseInt(pointTicket);
        int ticketAmount = Integer.parseInt(amount);
        int result = amountPoints - (ticketPoint * ticketAmount);
        return format.format(result);
    }

    public static String remainingPointsWithOutFormat(String points, String pointTicket, String amount) {
        int amountPoints = Integer.parseInt(points.replaceAll(REGEX, ""));
        int ticketPoint = Integer.parseInt(pointTicket);
        int ticketAmount = Integer.parseInt(amount);
        int result = amountPoints - (ticketPoint * ticketAmount);
        return String.valueOf(result);
    }

    public static String pointsWithOutFormat(String points) {
        int amountPoints = Integer.parseInt(points.replaceAll(REGEX, ""));
        return String.valueOf(amountPoints);
    }

    @SneakyThrows
    public static String dateExpiredTikect() {
        int daysValidateTicket = Integer.parseInt(Values.DAYS_VALIDITY_CODE.message());
        DateFormat outputFormat = new SimpleDateFormat(FORMAT_DATE);
        DateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date dateExpired = inputFormat.parse(LocalDate.now().plusDays(daysValidateTicket).toString());
        return outputFormat.format(dateExpired);
    }

    public static String finalPointsTicket(String pointTicket, String amount) {
        int ticketPoint = Integer.parseInt(pointTicket.replaceAll(REGEX, ""));
        int ticketAmount = Integer.parseInt(amount);
        int result = ticketPoint * ticketAmount;
        if (result == 0) {
            result = ticketPoint;
        }
        return String.valueOf(result);
    }

    @SneakyThrows
    public static String dateTransactionAccumulation(String date) {
        DateFormat outputFormat = new SimpleDateFormat(FORMAT_DATE);
        DateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date dateTransaction = inputFormat.parse(date);
        return outputFormat.format(dateTransaction);
    }

    @SneakyThrows
    public static String hourTransactionAccumulation(String date) {
        DateFormat outputFormat = new SimpleDateFormat("hh:mm");
        DateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date hourTransaction = inputFormat.parse(date);
        return outputFormat.format(hourTransaction);
    }

    public static String todayDate() {
        return new SimpleDateFormat(FORMAT_DATE).format(Calendar.getInstance().getTime());
    }
}
