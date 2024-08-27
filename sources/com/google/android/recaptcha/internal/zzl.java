package com.google.android.recaptcha.internal;

import com.google.android.gms.auth.api.credentials.CredentialsApi;
import okhttp3.internal.ws.WebSocketProtocol;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public final class zzl {

    @NotNull
    public static final zzk zza = new zzk(null);

    @NotNull
    public static final zzl zzb = new zzl(9999);

    @NotNull
    public static final zzl zzc = new zzl(CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT);

    @NotNull
    public static final zzl zzd = new zzl(1001);

    @NotNull
    public static final zzl zze = new zzl(CredentialsApi.ACTIVITY_RESULT_NO_HINTS_AVAILABLE);

    @NotNull
    public static final zzl zzf = new zzl(1003);

    @NotNull
    public static final zzl zzg = new zzl(1004);

    @NotNull
    public static final zzl zzh = new zzl(WebSocketProtocol.CLOSE_NO_STATUS_CODE);

    @NotNull
    public static final zzl zzi = new zzl(1006);

    @NotNull
    public static final zzl zzj = new zzl(1007);

    @NotNull
    public static final zzl zzk = new zzl(1008);

    @NotNull
    public static final zzl zzl = new zzl(1009);

    @NotNull
    public static final zzl zzm = new zzl(1010);
    private final int zzn;

    private zzl(int i10) {
        this.zzn = i10;
    }

    public final int zza() {
        return this.zzn;
    }
}
