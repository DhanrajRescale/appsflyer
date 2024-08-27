package com.google.android.gms.internal.p002firebaseauthapi;

import java.io.IOException;

/* loaded from: classes2.dex */
public class zzags extends IOException {
    private zzahp zza;
    private boolean zzb;

    public zzags(IOException iOException) {
        super(iOException.getMessage(), iOException);
        this.zza = null;
    }

    public static zzagr zza() {
        return new zzagr("Protocol message tag had invalid wire type.");
    }

    public static zzags zzb() {
        return new zzags("Protocol message end-group tag did not match expected tag.");
    }

    public static zzags zzc() {
        return new zzags("Protocol message contained an invalid tag (zero).");
    }

    public static zzags zzd() {
        return new zzags("Protocol message had invalid UTF-8.");
    }

    public static zzags zze() {
        return new zzags("CodedInputStream encountered a malformed varint.");
    }

    public static zzags zzf() {
        return new zzags("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static zzags zzg() {
        return new zzags("Failed to parse the message.");
    }

    public static zzags zzi() {
        return new zzags("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    public static zzags zzj() {
        return new zzags("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public final zzags zzh(zzahp zzahpVar) {
        this.zza = zzahpVar;
        return this;
    }

    public final void zzk() {
        this.zzb = true;
    }

    public final boolean zzl() {
        return this.zzb;
    }

    public zzags(String str) {
        super(str);
        this.zza = null;
    }
}
