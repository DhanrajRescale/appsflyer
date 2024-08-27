package jv;

import java.text.DateFormatSymbols;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public final class y extends u {

    /* renamed from: c, reason: collision with root package name */
    public static final c2.p f21737c = new c2.p(27);

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f21738b = new ConcurrentHashMap(16, 0.75f, 2);

    public static x b(HashMap hashMap) {
        hashMap.put(z.f21740b, hashMap.get(z.f21739a));
        hashMap.put(z.f21742d, hashMap.get(z.f21741c));
        z zVar = z.f21743e;
        if (hashMap.containsKey(zVar)) {
            z zVar2 = z.f21744f;
            if (!hashMap.containsKey(zVar2)) {
                hashMap.put(zVar2, hashMap.get(zVar));
            }
        }
        return new x(hashMap);
    }

    public static String c(int i10, String str, Locale locale) {
        if (locale.getLanguage().equals("zh") && locale.getCountry().equals("CN")) {
            switch (i10) {
                case 1:
                    return "一";
                case 2:
                    return "二";
                case 3:
                    return "三";
                case 4:
                    return "四";
                case 5:
                    return "五";
                case 6:
                    return "六";
                case 7:
                    return "日";
            }
        }
        if (locale.getLanguage().equals("ar")) {
            switch (i10) {
                case 1:
                    return "ن";
                case 2:
                    return "ث";
                case 3:
                    return "ر";
                case 4:
                    return "خ";
                case 5:
                    return "ج";
                case 6:
                    return "س";
                case 7:
                    return "ح";
            }
        }
        return str.substring(0, 1);
    }

    public static String d(int i10, String str, Locale locale) {
        if (locale.getLanguage().equals("zh") && locale.getCountry().equals("CN")) {
            switch (i10) {
                case 1:
                    return "一";
                case 2:
                    return "二";
                case 3:
                    return "三";
                case 4:
                    return "四";
                case 5:
                    return "五";
                case 6:
                    return "六";
                case 7:
                    return "七";
                case 8:
                    return "八";
                case 9:
                    return "九";
                case 10:
                    return "十";
                case 11:
                    return "十一";
                case 12:
                    return "十二";
            }
        }
        if (locale.getLanguage().equals("ar")) {
            switch (i10) {
                case 1:
                    return "ي";
                case 2:
                    return "ف";
                case 3:
                    return "م";
                case 4:
                    return "أ";
                case 5:
                    return "و";
                case 6:
                    return "ن";
                case 7:
                    return "ل";
                case 8:
                    return "غ";
                case 9:
                    return "س";
                case 10:
                    return "ك";
                case 11:
                    return "ب";
                case 12:
                    return "د";
            }
        }
        if (locale.getLanguage().equals("ja") && locale.getCountry().equals("JP")) {
            return Integer.toString(i10);
        }
        return str.substring(0, 1);
    }

    @Override // jv.u
    public final String a(lv.m mVar, long j10, z zVar, Locale locale) {
        Map map;
        AbstractMap.SimpleImmutableEntry simpleImmutableEntry;
        ConcurrentHashMap concurrentHashMap;
        Object obj;
        AbstractMap.SimpleImmutableEntry simpleImmutableEntry2 = new AbstractMap.SimpleImmutableEntry(mVar, locale);
        ConcurrentHashMap concurrentHashMap2 = this.f21738b;
        Object obj2 = concurrentHashMap2.get(simpleImmutableEntry2);
        if (obj2 == null) {
            lv.a aVar = lv.a.MONTH_OF_YEAR;
            z zVar2 = z.f21743e;
            z zVar3 = z.f21741c;
            z zVar4 = z.f21739a;
            if (mVar == aVar) {
                DateFormatSymbols dateFormatSymbols = DateFormatSymbols.getInstance(locale);
                HashMap hashMap = new HashMap();
                simpleImmutableEntry = simpleImmutableEntry2;
                concurrentHashMap = concurrentHashMap2;
                String[] months = dateFormatSymbols.getMonths();
                HashMap hashMap2 = new HashMap();
                hashMap2.put(1L, months[0]);
                hashMap2.put(2L, months[1]);
                hashMap2.put(3L, months[2]);
                hashMap2.put(4L, months[3]);
                hashMap2.put(5L, months[4]);
                hashMap2.put(6L, months[5]);
                hashMap2.put(7L, months[6]);
                hashMap2.put(8L, months[7]);
                hashMap2.put(9L, months[8]);
                hashMap2.put(10L, months[9]);
                hashMap2.put(11L, months[10]);
                hashMap2.put(12L, months[11]);
                hashMap.put(zVar4, hashMap2);
                HashMap hashMap3 = new HashMap();
                hashMap3.put(1L, d(1, months[0], locale));
                hashMap3.put(2L, d(2, months[1], locale));
                hashMap3.put(3L, d(3, months[2], locale));
                hashMap3.put(4L, d(4, months[3], locale));
                hashMap3.put(5L, d(5, months[4], locale));
                hashMap3.put(6L, d(6, months[5], locale));
                hashMap3.put(7L, d(7, months[6], locale));
                hashMap3.put(8L, d(8, months[7], locale));
                hashMap3.put(9L, d(9, months[8], locale));
                hashMap3.put(10L, d(10, months[9], locale));
                hashMap3.put(11L, d(11, months[10], locale));
                hashMap3.put(12L, d(12, months[11], locale));
                hashMap.put(zVar2, hashMap3);
                String[] shortMonths = dateFormatSymbols.getShortMonths();
                HashMap hashMap4 = new HashMap();
                hashMap4.put(1L, shortMonths[0]);
                hashMap4.put(2L, shortMonths[1]);
                hashMap4.put(3L, shortMonths[2]);
                hashMap4.put(4L, shortMonths[3]);
                hashMap4.put(5L, shortMonths[4]);
                hashMap4.put(6L, shortMonths[5]);
                hashMap4.put(7L, shortMonths[6]);
                hashMap4.put(8L, shortMonths[7]);
                hashMap4.put(9L, shortMonths[8]);
                hashMap4.put(10L, shortMonths[9]);
                hashMap4.put(11L, shortMonths[10]);
                hashMap4.put(12L, shortMonths[11]);
                hashMap.put(zVar3, hashMap4);
                obj = b(hashMap);
            } else {
                simpleImmutableEntry = simpleImmutableEntry2;
                concurrentHashMap = concurrentHashMap2;
                if (mVar == lv.a.DAY_OF_WEEK) {
                    DateFormatSymbols dateFormatSymbols2 = DateFormatSymbols.getInstance(locale);
                    HashMap hashMap5 = new HashMap();
                    String[] weekdays = dateFormatSymbols2.getWeekdays();
                    HashMap hashMap6 = new HashMap();
                    hashMap6.put(1L, weekdays[2]);
                    hashMap6.put(2L, weekdays[3]);
                    hashMap6.put(3L, weekdays[4]);
                    hashMap6.put(4L, weekdays[5]);
                    hashMap6.put(5L, weekdays[6]);
                    hashMap6.put(6L, weekdays[7]);
                    hashMap6.put(7L, weekdays[1]);
                    hashMap5.put(zVar4, hashMap6);
                    HashMap hashMap7 = new HashMap();
                    hashMap7.put(1L, c(1, weekdays[2], locale));
                    hashMap7.put(2L, c(2, weekdays[3], locale));
                    hashMap7.put(3L, c(3, weekdays[4], locale));
                    hashMap7.put(4L, c(4, weekdays[5], locale));
                    hashMap7.put(5L, c(5, weekdays[6], locale));
                    hashMap7.put(6L, c(6, weekdays[7], locale));
                    hashMap7.put(7L, c(7, weekdays[1], locale));
                    hashMap5.put(zVar2, hashMap7);
                    String[] shortWeekdays = dateFormatSymbols2.getShortWeekdays();
                    HashMap hashMap8 = new HashMap();
                    hashMap8.put(1L, shortWeekdays[2]);
                    hashMap8.put(2L, shortWeekdays[3]);
                    hashMap8.put(3L, shortWeekdays[4]);
                    hashMap8.put(4L, shortWeekdays[5]);
                    hashMap8.put(5L, shortWeekdays[6]);
                    hashMap8.put(6L, shortWeekdays[7]);
                    hashMap8.put(7L, shortWeekdays[1]);
                    hashMap5.put(zVar3, hashMap8);
                    obj = b(hashMap5);
                } else if (mVar == lv.a.AMPM_OF_DAY) {
                    DateFormatSymbols dateFormatSymbols3 = DateFormatSymbols.getInstance(locale);
                    HashMap hashMap9 = new HashMap();
                    String[] amPmStrings = dateFormatSymbols3.getAmPmStrings();
                    HashMap hashMap10 = new HashMap();
                    hashMap10.put(0L, amPmStrings[0]);
                    hashMap10.put(1L, amPmStrings[1]);
                    hashMap9.put(zVar4, hashMap10);
                    hashMap9.put(zVar3, hashMap10);
                    obj = b(hashMap9);
                } else if (mVar == lv.a.ERA) {
                    DateFormatSymbols dateFormatSymbols4 = DateFormatSymbols.getInstance(locale);
                    HashMap hashMap11 = new HashMap();
                    String[] eras = dateFormatSymbols4.getEras();
                    HashMap hashMap12 = new HashMap();
                    hashMap12.put(0L, eras[0]);
                    hashMap12.put(1L, eras[1]);
                    hashMap11.put(zVar3, hashMap12);
                    if (locale.getLanguage().equals(Locale.ENGLISH.getLanguage())) {
                        HashMap hashMap13 = new HashMap();
                        hashMap13.put(0L, "Before Christ");
                        hashMap13.put(1L, "Anno Domini");
                        hashMap11.put(zVar4, hashMap13);
                    } else {
                        hashMap11.put(zVar4, hashMap12);
                    }
                    HashMap hashMap14 = new HashMap();
                    hashMap14.put(0L, eras[0].substring(0, 1));
                    hashMap14.put(1L, eras[1].substring(0, 1));
                    hashMap11.put(zVar2, hashMap14);
                    obj = b(hashMap11);
                } else {
                    lv.h hVar = lv.i.f25445a;
                    if (mVar == lv.g.f25437a) {
                        HashMap hashMap15 = new HashMap();
                        HashMap hashMap16 = new HashMap();
                        hashMap16.put(1L, "Q1");
                        hashMap16.put(2L, "Q2");
                        hashMap16.put(3L, "Q3");
                        hashMap16.put(4L, "Q4");
                        hashMap15.put(zVar3, hashMap16);
                        HashMap hashMap17 = new HashMap();
                        hashMap17.put(1L, "1st quarter");
                        hashMap17.put(2L, "2nd quarter");
                        hashMap17.put(3L, "3rd quarter");
                        hashMap17.put(4L, "4th quarter");
                        hashMap15.put(zVar4, hashMap17);
                        obj = b(hashMap15);
                    } else {
                        obj = HttpUrl.FRAGMENT_ENCODE_SET;
                    }
                }
            }
            AbstractMap.SimpleImmutableEntry simpleImmutableEntry3 = simpleImmutableEntry;
            ConcurrentHashMap concurrentHashMap3 = concurrentHashMap;
            concurrentHashMap3.putIfAbsent(simpleImmutableEntry3, obj);
            obj2 = concurrentHashMap3.get(simpleImmutableEntry3);
        }
        if (!(obj2 instanceof x) || (map = (Map) ((x) obj2).f21736a.get(zVar)) == null) {
            return null;
        }
        return (String) map.get(Long.valueOf(j10));
    }
}
