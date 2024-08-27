package com.google.android.gms.internal.p002firebaseauthapi;

import java.lang.reflect.Method;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import nn.d;
import okhttp3.HttpUrl;
import okhttp3.internal.http2.Http2Connection;

/* loaded from: classes2.dex */
public final class zzajo {
    public static final zzait zza;
    public static final zzait zzb;
    public static final zzait zzc;
    private static final ThreadLocal zzd;
    private static final Method zze;
    private static final Method zzf;
    private static final Method zzg;

    static {
        zzais zzc2 = zzait.zzc();
        zzc2.zzb(-62135596800L);
        zzc2.zza(0);
        zza = (zzait) zzc2.zzi();
        zzais zzc3 = zzait.zzc();
        zzc3.zzb(253402300799L);
        zzc3.zza(999999999);
        zzb = (zzait) zzc3.zzi();
        zzais zzc4 = zzait.zzc();
        zzc4.zzb(0L);
        zzc4.zza(0);
        zzc = (zzait) zzc4.zzi();
        zzd = new zzajn();
        zze = zzc("now");
        zzf = zzc("getEpochSecond");
        zzg = zzc("getNano");
    }

    public static zzait zza(zzait zzaitVar) {
        long zzb2 = zzaitVar.zzb();
        int zza2 = zzaitVar.zza();
        if (zzb2 >= -62135596800L && zzb2 <= 253402300799L && zza2 >= 0 && zza2 < 1000000000) {
            return zzaitVar;
        }
        throw new IllegalArgumentException(String.format("Timestamp is not valid. See proto definition for valid values. Seconds (%s) must be in range [-62,135,596,800, +253,402,300,799]. Nanos (%s) must be in range [0, +999,999,999].", Long.valueOf(zzb2), Integer.valueOf(zza2)));
    }

    public static zzait zzb(String str) throws ParseException {
        String str2;
        int i10;
        int indexOf = str.indexOf(84);
        if (indexOf != -1) {
            int indexOf2 = str.indexOf(90, indexOf);
            if (indexOf2 == -1) {
                indexOf2 = str.indexOf(43, indexOf);
            }
            if (indexOf2 == -1) {
                indexOf2 = str.indexOf(45, indexOf);
            }
            if (indexOf2 != -1) {
                String substring = str.substring(0, indexOf2);
                int indexOf3 = substring.indexOf(46);
                if (indexOf3 != -1) {
                    String substring2 = substring.substring(0, indexOf3);
                    str2 = substring.substring(indexOf3 + 1);
                    substring = substring2;
                } else {
                    str2 = HttpUrl.FRAGMENT_ENCODE_SET;
                }
                long time = ((SimpleDateFormat) zzd.get()).parse(substring).getTime() / 1000;
                if (str2.isEmpty()) {
                    i10 = 0;
                } else {
                    i10 = 0;
                    for (int i11 = 0; i11 < 9; i11++) {
                        i10 *= 10;
                        if (i11 < str2.length()) {
                            if (str2.charAt(i11) >= '0' && str2.charAt(i11) <= '9') {
                                i10 = (str2.charAt(i11) - '0') + i10;
                            } else {
                                throw new ParseException("Invalid nanoseconds.", 0);
                            }
                        }
                    }
                }
                if (str.charAt(indexOf2) == 'Z') {
                    if (str.length() != indexOf2 + 1) {
                        throw new ParseException(d.k("Failed to parse timestamp: invalid trailing data \"", str.substring(indexOf2), "\""), 0);
                    }
                } else {
                    String substring3 = str.substring(indexOf2 + 1);
                    int indexOf4 = substring3.indexOf(58);
                    if (indexOf4 != -1) {
                        String substring4 = substring3.substring(0, indexOf4);
                        long parseLong = (Long.parseLong(substring3.substring(indexOf4 + 1)) + (Long.parseLong(substring4) * 60)) * 60;
                        if (str.charAt(indexOf2) == '+') {
                            time -= parseLong;
                        } else {
                            time += parseLong;
                        }
                    } else {
                        throw new ParseException("Invalid offset value: ".concat(substring3), 0);
                    }
                }
                if (i10 <= -1000000000 || i10 >= 1000000000) {
                    try {
                        time = zzbb.zza(time, i10 / Http2Connection.DEGRADED_PONG_TIMEOUT_NS);
                        i10 %= Http2Connection.DEGRADED_PONG_TIMEOUT_NS;
                    } catch (IllegalArgumentException e10) {
                        ParseException parseException = new ParseException(d.k("Failed to parse timestamp ", str, " Timestamp is out of range."), 0);
                        parseException.initCause(e10);
                        throw parseException;
                    }
                }
                if (i10 < 0) {
                    i10 += Http2Connection.DEGRADED_PONG_TIMEOUT_NS;
                    time = zzbb.zzb(time, 1L);
                }
                zzais zzc2 = zzait.zzc();
                zzc2.zzb(time);
                zzc2.zza(i10);
                zzait zzaitVar = (zzait) zzc2.zzi();
                zza(zzaitVar);
                return zzaitVar;
            }
            throw new ParseException("Failed to parse timestamp: missing valid timezone offset.", 0);
        }
        throw new ParseException(d.k("Failed to parse timestamp: invalid timestamp \"", str, "\""), 0);
    }

    private static Method zzc(String str) {
        try {
            return Class.forName("java.time.Instant").getMethod(str, new Class[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
