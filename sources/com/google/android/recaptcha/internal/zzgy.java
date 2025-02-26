package com.google.android.recaptcha.internal;

import java.io.IOException;

/* loaded from: classes2.dex */
public class zzgy extends IOException {
    private zzhy zza;
    private boolean zzb;

    public zzgy(IOException iOException) {
        super(iOException.getMessage(), iOException);
        this.zza = null;
    }

    public static zzgx zza() {
        return new zzgx("Protocol message tag had invalid wire type.");
    }

    public static zzgy zzb() {
        return new zzgy("Protocol message end-group tag did not match expected tag.");
    }

    public static zzgy zzc() {
        return new zzgy("Protocol message contained an invalid tag (zero).");
    }

    public static zzgy zzd() {
        return new zzgy("Protocol message had invalid UTF-8.");
    }

    public static zzgy zze() {
        return new zzgy("CodedInputStream encountered a malformed varint.");
    }

    public static zzgy zzf() {
        return new zzgy("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static zzgy zzg() {
        return new zzgy("Failed to parse the message.");
    }

    public static zzgy zzi() {
        return new zzgy("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    public static zzgy zzj() {
        return new zzgy("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public final zzgy zzh(zzhy zzhyVar) {
        this.zza = zzhyVar;
        return this;
    }

    public final void zzk() {
        this.zzb = true;
    }

    public final boolean zzl() {
        return this.zzb;
    }

    public zzgy(String str) {
        super(str);
        this.zza = null;
    }
}
