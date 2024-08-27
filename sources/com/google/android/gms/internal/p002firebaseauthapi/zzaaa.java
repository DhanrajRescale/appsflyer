package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.TaskCompletionSource;
import kp.j;
import zp.l;

/* loaded from: classes2.dex */
final class zzaaa extends zzabg {
    private final String zza;
    private final String zzb;

    public zzaaa(String str, String str2) {
        super(4);
        Preconditions.checkNotEmpty(str, "code cannot be null or empty");
        this.zza = str;
        this.zzb = str2;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzabi
    public final String zza() {
        return "verifyPasswordResetCode";
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzabg
    public final void zzb() {
        char c10;
        zzadn zzadnVar = this.zzq;
        if (zzadnVar.zzh()) {
            zzadnVar.zzd();
        } else {
            zzadnVar.zzc();
        }
        zzadnVar.zzc();
        char c11 = 3;
        if (zzadnVar.zzi()) {
            String zze = zzadnVar.zze();
            char c12 = 5;
            switch (zze.hashCode()) {
                case -1874510116:
                    if (zze.equals("REVERT_SECOND_FACTOR_ADDITION")) {
                        c10 = 5;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1452371317:
                    if (zze.equals("PASSWORD_RESET")) {
                        c10 = 0;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1341836234:
                    if (zze.equals("VERIFY_EMAIL")) {
                        c10 = 1;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1099157829:
                    if (zze.equals("VERIFY_AND_CHANGE_EMAIL")) {
                        c10 = 3;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 870738373:
                    if (zze.equals("EMAIL_SIGNIN")) {
                        c10 = 2;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 970484929:
                    if (zze.equals("RECOVER_EMAIL")) {
                        c10 = 4;
                        break;
                    }
                    c10 = 65535;
                    break;
                default:
                    c10 = 65535;
                    break;
            }
            if (c10 != 0) {
                if (c10 != 1) {
                    if (c10 != 2) {
                        if (c10 != 3) {
                            if (c10 != 4) {
                                if (c10 != 5) {
                                    c12 = 3;
                                } else {
                                    c12 = 6;
                                }
                            } else {
                                c12 = 2;
                            }
                        }
                    } else {
                        c12 = 4;
                    }
                } else {
                    c12 = 1;
                }
            } else {
                c12 = 0;
            }
            if (c12 != 4 && c12 != 3) {
                if (zzadnVar.zzg()) {
                    String zzc = zzadnVar.zzc();
                    l h02 = j.h0(zzadnVar.zzb());
                    new b4.l(9).f3178b = Preconditions.checkNotEmpty(zzc);
                } else if (zzadnVar.zzh()) {
                    String zzd = zzadnVar.zzd();
                    String zzc2 = zzadnVar.zzc();
                    new b4.l(9).f3178b = Preconditions.checkNotEmpty(zzd);
                    Preconditions.checkNotEmpty(zzc2);
                } else if (zzadnVar.zzf()) {
                    new b4.l(9).f3178b = Preconditions.checkNotEmpty(zzadnVar.zzc());
                }
            }
            c11 = c12;
        }
        if (c11 != 0) {
            zzl(new Status(17499));
        } else {
            zzm(this.zzq.zzc());
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzabi
    public final void zzc(TaskCompletionSource taskCompletionSource, zzaaf zzaafVar) {
        this.zzk = new zzabf(this, taskCompletionSource);
        zzaafVar.zzd(this.zza, this.zzb, this.zzf);
    }
}
