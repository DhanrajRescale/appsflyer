package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.Api;
import java.io.IOException;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzafm implements zzaia {
    private final zzafl zza;
    private int zzb;
    private int zzc;
    private int zzd = 0;

    private zzafm(zzafl zzaflVar) {
        byte[] bArr = zzagq.zzd;
        this.zza = zzaflVar;
        zzaflVar.zzc = this;
    }

    private final void zzP(Object obj, zzaib zzaibVar, zzafx zzafxVar) throws IOException {
        int i10 = this.zzc;
        this.zzc = ((this.zzb >>> 3) << 3) | 4;
        try {
            zzaibVar.zzh(obj, this, zzafxVar);
            if (this.zzb == this.zzc) {
            } else {
                throw zzags.zzg();
            }
        } finally {
            this.zzc = i10;
        }
    }

    private final void zzQ(Object obj, zzaib zzaibVar, zzafx zzafxVar) throws IOException {
        int zzn = this.zza.zzn();
        zzafl zzaflVar = this.zza;
        if (zzaflVar.zza < zzaflVar.zzb) {
            int zze = zzaflVar.zze(zzn);
            this.zza.zza++;
            zzaibVar.zzh(obj, this, zzafxVar);
            this.zza.zzz(0);
            r5.zza--;
            this.zza.zzA(zze);
            return;
        }
        throw new zzags("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    private final void zzR(int i10) throws IOException {
        if (this.zza.zzd() == i10) {
        } else {
            throw zzags.zzj();
        }
    }

    private final void zzS(int i10) throws IOException {
        if ((this.zzb & 7) == i10) {
        } else {
            throw zzags.zza();
        }
    }

    private static final void zzT(int i10) throws IOException {
        if ((i10 & 3) == 0) {
        } else {
            throw zzags.zzg();
        }
    }

    private static final void zzU(int i10) throws IOException {
        if ((i10 & 7) == 0) {
        } else {
            throw zzags.zzg();
        }
    }

    public static zzafm zzq(zzafl zzaflVar) {
        zzafm zzafmVar = zzaflVar.zzc;
        if (zzafmVar != null) {
            return zzafmVar;
        }
        return new zzafm(zzaflVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaia
    public final void zzA(List list) throws IOException {
        int zzm;
        int zzm2;
        if (list instanceof zzahe) {
            zzahe zzaheVar = (zzahe) list;
            int i10 = this.zzb & 7;
            if (i10 != 1) {
                if (i10 == 2) {
                    int zzn = this.zza.zzn();
                    zzU(zzn);
                    int zzd = this.zza.zzd() + zzn;
                    do {
                        zzaheVar.zzf(this.zza.zzo());
                    } while (this.zza.zzd() < zzd);
                    return;
                }
                throw zzags.zza();
            }
            do {
                zzaheVar.zzf(this.zza.zzo());
                if (this.zza.zzC()) {
                    return;
                } else {
                    zzm2 = this.zza.zzm();
                }
            } while (zzm2 == this.zzb);
            this.zzd = zzm2;
            return;
        }
        int i11 = this.zzb & 7;
        if (i11 != 1) {
            if (i11 == 2) {
                int zzn2 = this.zza.zzn();
                zzU(zzn2);
                int zzd2 = this.zza.zzd() + zzn2;
                do {
                    list.add(Long.valueOf(this.zza.zzo()));
                } while (this.zza.zzd() < zzd2);
                return;
            }
            throw zzags.zza();
        }
        do {
            list.add(Long.valueOf(this.zza.zzo()));
            if (this.zza.zzC()) {
                return;
            } else {
                zzm = this.zza.zzm();
            }
        } while (zzm == this.zzb);
        this.zzd = zzm;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaia
    public final void zzB(List list) throws IOException {
        int zzm;
        int zzm2;
        if (list instanceof zzage) {
            zzage zzageVar = (zzage) list;
            int i10 = this.zzb & 7;
            if (i10 != 2) {
                if (i10 != 5) {
                    throw zzags.zza();
                }
                do {
                    zzageVar.zze(this.zza.zzc());
                    if (this.zza.zzC()) {
                        return;
                    } else {
                        zzm2 = this.zza.zzm();
                    }
                } while (zzm2 == this.zzb);
                this.zzd = zzm2;
                return;
            }
            int zzn = this.zza.zzn();
            zzT(zzn);
            int zzd = this.zza.zzd() + zzn;
            do {
                zzageVar.zze(this.zza.zzc());
            } while (this.zza.zzd() < zzd);
            return;
        }
        int i11 = this.zzb & 7;
        if (i11 != 2) {
            if (i11 != 5) {
                throw zzags.zza();
            }
            do {
                list.add(Float.valueOf(this.zza.zzc()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    zzm = this.zza.zzm();
                }
            } while (zzm == this.zzb);
            this.zzd = zzm;
            return;
        }
        int zzn2 = this.zza.zzn();
        zzT(zzn2);
        int zzd2 = this.zza.zzd() + zzn2;
        do {
            list.add(Float.valueOf(this.zza.zzc()));
        } while (this.zza.zzd() < zzd2);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaia
    @Deprecated
    public final void zzC(List list, zzaib zzaibVar, zzafx zzafxVar) throws IOException {
        int zzm;
        int i10 = this.zzb;
        if ((i10 & 7) != 3) {
            throw zzags.zza();
        }
        do {
            Object zze = zzaibVar.zze();
            zzP(zze, zzaibVar, zzafxVar);
            zzaibVar.zzf(zze);
            list.add(zze);
            if (!this.zza.zzC() && this.zzd == 0) {
                zzm = this.zza.zzm();
            } else {
                return;
            }
        } while (zzm == i10);
        this.zzd = zzm;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaia
    public final void zzD(List list) throws IOException {
        int zzm;
        int zzm2;
        if (list instanceof zzagl) {
            zzagl zzaglVar = (zzagl) list;
            int i10 = this.zzb & 7;
            if (i10 != 0) {
                if (i10 == 2) {
                    int zzd = this.zza.zzd() + this.zza.zzn();
                    do {
                        zzaglVar.zzf(this.zza.zzh());
                    } while (this.zza.zzd() < zzd);
                    zzR(zzd);
                    return;
                }
                throw zzags.zza();
            }
            do {
                zzaglVar.zzf(this.zza.zzh());
                if (this.zza.zzC()) {
                    return;
                } else {
                    zzm2 = this.zza.zzm();
                }
            } while (zzm2 == this.zzb);
            this.zzd = zzm2;
            return;
        }
        int i11 = this.zzb & 7;
        if (i11 != 0) {
            if (i11 == 2) {
                int zzd2 = this.zza.zzd() + this.zza.zzn();
                do {
                    list.add(Integer.valueOf(this.zza.zzh()));
                } while (this.zza.zzd() < zzd2);
                zzR(zzd2);
                return;
            }
            throw zzags.zza();
        }
        do {
            list.add(Integer.valueOf(this.zza.zzh()));
            if (this.zza.zzC()) {
                return;
            } else {
                zzm = this.zza.zzm();
            }
        } while (zzm == this.zzb);
        this.zzd = zzm;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaia
    public final void zzE(List list) throws IOException {
        int zzm;
        int zzm2;
        if (list instanceof zzahe) {
            zzahe zzaheVar = (zzahe) list;
            int i10 = this.zzb & 7;
            if (i10 != 0) {
                if (i10 == 2) {
                    int zzd = this.zza.zzd() + this.zza.zzn();
                    do {
                        zzaheVar.zzf(this.zza.zzp());
                    } while (this.zza.zzd() < zzd);
                    zzR(zzd);
                    return;
                }
                throw zzags.zza();
            }
            do {
                zzaheVar.zzf(this.zza.zzp());
                if (this.zza.zzC()) {
                    return;
                } else {
                    zzm2 = this.zza.zzm();
                }
            } while (zzm2 == this.zzb);
            this.zzd = zzm2;
            return;
        }
        int i11 = this.zzb & 7;
        if (i11 != 0) {
            if (i11 == 2) {
                int zzd2 = this.zza.zzd() + this.zza.zzn();
                do {
                    list.add(Long.valueOf(this.zza.zzp()));
                } while (this.zza.zzd() < zzd2);
                zzR(zzd2);
                return;
            }
            throw zzags.zza();
        }
        do {
            list.add(Long.valueOf(this.zza.zzp()));
            if (this.zza.zzC()) {
                return;
            } else {
                zzm = this.zza.zzm();
            }
        } while (zzm == this.zzb);
        this.zzd = zzm;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaia
    public final void zzF(List list, zzaib zzaibVar, zzafx zzafxVar) throws IOException {
        int zzm;
        int i10 = this.zzb;
        if ((i10 & 7) != 2) {
            throw zzags.zza();
        }
        do {
            Object zze = zzaibVar.zze();
            zzQ(zze, zzaibVar, zzafxVar);
            zzaibVar.zzf(zze);
            list.add(zze);
            if (!this.zza.zzC() && this.zzd == 0) {
                zzm = this.zza.zzm();
            } else {
                return;
            }
        } while (zzm == i10);
        this.zzd = zzm;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaia
    public final void zzG(List list) throws IOException {
        int zzm;
        int zzm2;
        if (list instanceof zzagl) {
            zzagl zzaglVar = (zzagl) list;
            int i10 = this.zzb & 7;
            if (i10 != 2) {
                if (i10 != 5) {
                    throw zzags.zza();
                }
                do {
                    zzaglVar.zzf(this.zza.zzk());
                    if (this.zza.zzC()) {
                        return;
                    } else {
                        zzm2 = this.zza.zzm();
                    }
                } while (zzm2 == this.zzb);
                this.zzd = zzm2;
                return;
            }
            int zzn = this.zza.zzn();
            zzT(zzn);
            int zzd = this.zza.zzd() + zzn;
            do {
                zzaglVar.zzf(this.zza.zzk());
            } while (this.zza.zzd() < zzd);
            return;
        }
        int i11 = this.zzb & 7;
        if (i11 != 2) {
            if (i11 != 5) {
                throw zzags.zza();
            }
            do {
                list.add(Integer.valueOf(this.zza.zzk()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    zzm = this.zza.zzm();
                }
            } while (zzm == this.zzb);
            this.zzd = zzm;
            return;
        }
        int zzn2 = this.zza.zzn();
        zzT(zzn2);
        int zzd2 = this.zza.zzd() + zzn2;
        do {
            list.add(Integer.valueOf(this.zza.zzk()));
        } while (this.zza.zzd() < zzd2);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaia
    public final void zzH(List list) throws IOException {
        int zzm;
        int zzm2;
        if (list instanceof zzahe) {
            zzahe zzaheVar = (zzahe) list;
            int i10 = this.zzb & 7;
            if (i10 != 1) {
                if (i10 == 2) {
                    int zzn = this.zza.zzn();
                    zzU(zzn);
                    int zzd = this.zza.zzd() + zzn;
                    do {
                        zzaheVar.zzf(this.zza.zzt());
                    } while (this.zza.zzd() < zzd);
                    return;
                }
                throw zzags.zza();
            }
            do {
                zzaheVar.zzf(this.zza.zzt());
                if (this.zza.zzC()) {
                    return;
                } else {
                    zzm2 = this.zza.zzm();
                }
            } while (zzm2 == this.zzb);
            this.zzd = zzm2;
            return;
        }
        int i11 = this.zzb & 7;
        if (i11 != 1) {
            if (i11 == 2) {
                int zzn2 = this.zza.zzn();
                zzU(zzn2);
                int zzd2 = this.zza.zzd() + zzn2;
                do {
                    list.add(Long.valueOf(this.zza.zzt()));
                } while (this.zza.zzd() < zzd2);
                return;
            }
            throw zzags.zza();
        }
        do {
            list.add(Long.valueOf(this.zza.zzt()));
            if (this.zza.zzC()) {
                return;
            } else {
                zzm = this.zza.zzm();
            }
        } while (zzm == this.zzb);
        this.zzd = zzm;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaia
    public final void zzI(List list) throws IOException {
        int zzm;
        int zzm2;
        if (list instanceof zzagl) {
            zzagl zzaglVar = (zzagl) list;
            int i10 = this.zzb & 7;
            if (i10 != 0) {
                if (i10 == 2) {
                    int zzd = this.zza.zzd() + this.zza.zzn();
                    do {
                        zzaglVar.zzf(this.zza.zzl());
                    } while (this.zza.zzd() < zzd);
                    zzR(zzd);
                    return;
                }
                throw zzags.zza();
            }
            do {
                zzaglVar.zzf(this.zza.zzl());
                if (this.zza.zzC()) {
                    return;
                } else {
                    zzm2 = this.zza.zzm();
                }
            } while (zzm2 == this.zzb);
            this.zzd = zzm2;
            return;
        }
        int i11 = this.zzb & 7;
        if (i11 != 0) {
            if (i11 == 2) {
                int zzd2 = this.zza.zzd() + this.zza.zzn();
                do {
                    list.add(Integer.valueOf(this.zza.zzl()));
                } while (this.zza.zzd() < zzd2);
                zzR(zzd2);
                return;
            }
            throw zzags.zza();
        }
        do {
            list.add(Integer.valueOf(this.zza.zzl()));
            if (this.zza.zzC()) {
                return;
            } else {
                zzm = this.zza.zzm();
            }
        } while (zzm == this.zzb);
        this.zzd = zzm;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaia
    public final void zzJ(List list) throws IOException {
        int zzm;
        int zzm2;
        if (list instanceof zzahe) {
            zzahe zzaheVar = (zzahe) list;
            int i10 = this.zzb & 7;
            if (i10 != 0) {
                if (i10 == 2) {
                    int zzd = this.zza.zzd() + this.zza.zzn();
                    do {
                        zzaheVar.zzf(this.zza.zzu());
                    } while (this.zza.zzd() < zzd);
                    zzR(zzd);
                    return;
                }
                throw zzags.zza();
            }
            do {
                zzaheVar.zzf(this.zza.zzu());
                if (this.zza.zzC()) {
                    return;
                } else {
                    zzm2 = this.zza.zzm();
                }
            } while (zzm2 == this.zzb);
            this.zzd = zzm2;
            return;
        }
        int i11 = this.zzb & 7;
        if (i11 != 0) {
            if (i11 == 2) {
                int zzd2 = this.zza.zzd() + this.zza.zzn();
                do {
                    list.add(Long.valueOf(this.zza.zzu()));
                } while (this.zza.zzd() < zzd2);
                zzR(zzd2);
                return;
            }
            throw zzags.zza();
        }
        do {
            list.add(Long.valueOf(this.zza.zzu()));
            if (this.zza.zzC()) {
                return;
            } else {
                zzm = this.zza.zzm();
            }
        } while (zzm == this.zzb);
        this.zzd = zzm;
    }

    public final void zzK(List list, boolean z10) throws IOException {
        String zzr;
        int zzm;
        int zzm2;
        if ((this.zzb & 7) == 2) {
            if ((list instanceof zzagx) && !z10) {
                zzagx zzagxVar = (zzagx) list;
                do {
                    zzagxVar.zzi(zzp());
                    if (this.zza.zzC()) {
                        return;
                    } else {
                        zzm2 = this.zza.zzm();
                    }
                } while (zzm2 == this.zzb);
                this.zzd = zzm2;
                return;
            }
            do {
                if (z10) {
                    zzr = zzs();
                } else {
                    zzr = zzr();
                }
                list.add(zzr);
                if (this.zza.zzC()) {
                    return;
                } else {
                    zzm = this.zza.zzm();
                }
            } while (zzm == this.zzb);
            this.zzd = zzm;
            return;
        }
        throw zzags.zza();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaia
    public final void zzL(List list) throws IOException {
        int zzm;
        int zzm2;
        if (list instanceof zzagl) {
            zzagl zzaglVar = (zzagl) list;
            int i10 = this.zzb & 7;
            if (i10 != 0) {
                if (i10 == 2) {
                    int zzd = this.zza.zzd() + this.zza.zzn();
                    do {
                        zzaglVar.zzf(this.zza.zzn());
                    } while (this.zza.zzd() < zzd);
                    zzR(zzd);
                    return;
                }
                throw zzags.zza();
            }
            do {
                zzaglVar.zzf(this.zza.zzn());
                if (this.zza.zzC()) {
                    return;
                } else {
                    zzm2 = this.zza.zzm();
                }
            } while (zzm2 == this.zzb);
            this.zzd = zzm2;
            return;
        }
        int i11 = this.zzb & 7;
        if (i11 != 0) {
            if (i11 == 2) {
                int zzd2 = this.zza.zzd() + this.zza.zzn();
                do {
                    list.add(Integer.valueOf(this.zza.zzn()));
                } while (this.zza.zzd() < zzd2);
                zzR(zzd2);
                return;
            }
            throw zzags.zza();
        }
        do {
            list.add(Integer.valueOf(this.zza.zzn()));
            if (this.zza.zzC()) {
                return;
            } else {
                zzm = this.zza.zzm();
            }
        } while (zzm == this.zzb);
        this.zzd = zzm;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaia
    public final void zzM(List list) throws IOException {
        int zzm;
        int zzm2;
        if (list instanceof zzahe) {
            zzahe zzaheVar = (zzahe) list;
            int i10 = this.zzb & 7;
            if (i10 != 0) {
                if (i10 == 2) {
                    int zzd = this.zza.zzd() + this.zza.zzn();
                    do {
                        zzaheVar.zzf(this.zza.zzv());
                    } while (this.zza.zzd() < zzd);
                    zzR(zzd);
                    return;
                }
                throw zzags.zza();
            }
            do {
                zzaheVar.zzf(this.zza.zzv());
                if (this.zza.zzC()) {
                    return;
                } else {
                    zzm2 = this.zza.zzm();
                }
            } while (zzm2 == this.zzb);
            this.zzd = zzm2;
            return;
        }
        int i11 = this.zzb & 7;
        if (i11 != 0) {
            if (i11 == 2) {
                int zzd2 = this.zza.zzd() + this.zza.zzn();
                do {
                    list.add(Long.valueOf(this.zza.zzv()));
                } while (this.zza.zzd() < zzd2);
                zzR(zzd2);
                return;
            }
            throw zzags.zza();
        }
        do {
            list.add(Long.valueOf(this.zza.zzv()));
            if (this.zza.zzC()) {
                return;
            } else {
                zzm = this.zza.zzm();
            }
        } while (zzm == this.zzb);
        this.zzd = zzm;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaia
    public final boolean zzN() throws IOException {
        zzS(0);
        return this.zza.zzD();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaia
    public final boolean zzO() throws IOException {
        int i10;
        if (!this.zza.zzC() && (i10 = this.zzb) != this.zzc) {
            return this.zza.zzE(i10);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaia
    public final double zza() throws IOException {
        zzS(1);
        return this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaia
    public final float zzb() throws IOException {
        zzS(5);
        return this.zza.zzc();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaia
    public final int zzc() throws IOException {
        int i10 = this.zzd;
        if (i10 != 0) {
            this.zzb = i10;
            this.zzd = 0;
        } else {
            i10 = this.zza.zzm();
            this.zzb = i10;
        }
        if (i10 != 0 && i10 != this.zzc) {
            return i10 >>> 3;
        }
        return Api.BaseClientBuilder.API_PRIORITY_OTHER;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaia
    public final int zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaia
    public final int zze() throws IOException {
        zzS(0);
        return this.zza.zzf();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaia
    public final int zzf() throws IOException {
        zzS(5);
        return this.zza.zzg();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaia
    public final int zzg() throws IOException {
        zzS(0);
        return this.zza.zzh();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaia
    public final int zzh() throws IOException {
        zzS(5);
        return this.zza.zzk();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaia
    public final int zzi() throws IOException {
        zzS(0);
        return this.zza.zzl();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaia
    public final int zzj() throws IOException {
        zzS(0);
        return this.zza.zzn();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaia
    public final long zzk() throws IOException {
        zzS(1);
        return this.zza.zzo();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaia
    public final long zzl() throws IOException {
        zzS(0);
        return this.zza.zzp();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaia
    public final long zzm() throws IOException {
        zzS(1);
        return this.zza.zzt();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaia
    public final long zzn() throws IOException {
        zzS(0);
        return this.zza.zzu();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaia
    public final long zzo() throws IOException {
        zzS(0);
        return this.zza.zzv();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaia
    public final zzaff zzp() throws IOException {
        zzS(2);
        return this.zza.zzw();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaia
    public final String zzr() throws IOException {
        zzS(2);
        return this.zza.zzx();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaia
    public final String zzs() throws IOException {
        zzS(2);
        return this.zza.zzy();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaia
    public final void zzt(Object obj, zzaib zzaibVar, zzafx zzafxVar) throws IOException {
        zzS(3);
        zzP(obj, zzaibVar, zzafxVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaia
    public final void zzu(Object obj, zzaib zzaibVar, zzafx zzafxVar) throws IOException {
        zzS(2);
        zzQ(obj, zzaibVar, zzafxVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaia
    public final void zzv(List list) throws IOException {
        int zzm;
        int zzm2;
        if (list instanceof zzaeu) {
            zzaeu zzaeuVar = (zzaeu) list;
            int i10 = this.zzb & 7;
            if (i10 != 0) {
                if (i10 == 2) {
                    int zzd = this.zza.zzd() + this.zza.zzn();
                    do {
                        zzaeuVar.zze(this.zza.zzD());
                    } while (this.zza.zzd() < zzd);
                    zzR(zzd);
                    return;
                }
                throw zzags.zza();
            }
            do {
                zzaeuVar.zze(this.zza.zzD());
                if (this.zza.zzC()) {
                    return;
                } else {
                    zzm2 = this.zza.zzm();
                }
            } while (zzm2 == this.zzb);
            this.zzd = zzm2;
            return;
        }
        int i11 = this.zzb & 7;
        if (i11 != 0) {
            if (i11 == 2) {
                int zzd2 = this.zza.zzd() + this.zza.zzn();
                do {
                    list.add(Boolean.valueOf(this.zza.zzD()));
                } while (this.zza.zzd() < zzd2);
                zzR(zzd2);
                return;
            }
            throw zzags.zza();
        }
        do {
            list.add(Boolean.valueOf(this.zza.zzD()));
            if (this.zza.zzC()) {
                return;
            } else {
                zzm = this.zza.zzm();
            }
        } while (zzm == this.zzb);
        this.zzd = zzm;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaia
    public final void zzw(List list) throws IOException {
        int zzm;
        if ((this.zzb & 7) != 2) {
            throw zzags.zza();
        }
        do {
            list.add(zzp());
            if (this.zza.zzC()) {
                return;
            } else {
                zzm = this.zza.zzm();
            }
        } while (zzm == this.zzb);
        this.zzd = zzm;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaia
    public final void zzx(List list) throws IOException {
        int zzm;
        int zzm2;
        if (list instanceof zzafu) {
            zzafu zzafuVar = (zzafu) list;
            int i10 = this.zzb & 7;
            if (i10 != 1) {
                if (i10 == 2) {
                    int zzn = this.zza.zzn();
                    zzU(zzn);
                    int zzd = this.zza.zzd() + zzn;
                    do {
                        zzafuVar.zze(this.zza.zzb());
                    } while (this.zza.zzd() < zzd);
                    return;
                }
                throw zzags.zza();
            }
            do {
                zzafuVar.zze(this.zza.zzb());
                if (this.zza.zzC()) {
                    return;
                } else {
                    zzm2 = this.zza.zzm();
                }
            } while (zzm2 == this.zzb);
            this.zzd = zzm2;
            return;
        }
        int i11 = this.zzb & 7;
        if (i11 != 1) {
            if (i11 == 2) {
                int zzn2 = this.zza.zzn();
                zzU(zzn2);
                int zzd2 = this.zza.zzd() + zzn2;
                do {
                    list.add(Double.valueOf(this.zza.zzb()));
                } while (this.zza.zzd() < zzd2);
                return;
            }
            throw zzags.zza();
        }
        do {
            list.add(Double.valueOf(this.zza.zzb()));
            if (this.zza.zzC()) {
                return;
            } else {
                zzm = this.zza.zzm();
            }
        } while (zzm == this.zzb);
        this.zzd = zzm;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaia
    public final void zzy(List list) throws IOException {
        int zzm;
        int zzm2;
        if (list instanceof zzagl) {
            zzagl zzaglVar = (zzagl) list;
            int i10 = this.zzb & 7;
            if (i10 != 0) {
                if (i10 == 2) {
                    int zzd = this.zza.zzd() + this.zza.zzn();
                    do {
                        zzaglVar.zzf(this.zza.zzf());
                    } while (this.zza.zzd() < zzd);
                    zzR(zzd);
                    return;
                }
                throw zzags.zza();
            }
            do {
                zzaglVar.zzf(this.zza.zzf());
                if (this.zza.zzC()) {
                    return;
                } else {
                    zzm2 = this.zza.zzm();
                }
            } while (zzm2 == this.zzb);
            this.zzd = zzm2;
            return;
        }
        int i11 = this.zzb & 7;
        if (i11 != 0) {
            if (i11 == 2) {
                int zzd2 = this.zza.zzd() + this.zza.zzn();
                do {
                    list.add(Integer.valueOf(this.zza.zzf()));
                } while (this.zza.zzd() < zzd2);
                zzR(zzd2);
                return;
            }
            throw zzags.zza();
        }
        do {
            list.add(Integer.valueOf(this.zza.zzf()));
            if (this.zza.zzC()) {
                return;
            } else {
                zzm = this.zza.zzm();
            }
        } while (zzm == this.zzb);
        this.zzd = zzm;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaia
    public final void zzz(List list) throws IOException {
        int zzm;
        int zzm2;
        if (list instanceof zzagl) {
            zzagl zzaglVar = (zzagl) list;
            int i10 = this.zzb & 7;
            if (i10 != 2) {
                if (i10 != 5) {
                    throw zzags.zza();
                }
                do {
                    zzaglVar.zzf(this.zza.zzg());
                    if (this.zza.zzC()) {
                        return;
                    } else {
                        zzm2 = this.zza.zzm();
                    }
                } while (zzm2 == this.zzb);
                this.zzd = zzm2;
                return;
            }
            int zzn = this.zza.zzn();
            zzT(zzn);
            int zzd = this.zza.zzd() + zzn;
            do {
                zzaglVar.zzf(this.zza.zzg());
            } while (this.zza.zzd() < zzd);
            return;
        }
        int i11 = this.zzb & 7;
        if (i11 != 2) {
            if (i11 != 5) {
                throw zzags.zza();
            }
            do {
                list.add(Integer.valueOf(this.zza.zzg()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    zzm = this.zza.zzm();
                }
            } while (zzm == this.zzb);
            this.zzd = zzm;
            return;
        }
        int zzn2 = this.zza.zzn();
        zzT(zzn2);
        int zzd2 = this.zza.zzd() + zzn2;
        do {
            list.add(Integer.valueOf(this.zza.zzg()));
        } while (this.zza.zzd() < zzd2);
    }
}
