package com.google.android.recaptcha.internal;

import com.google.android.gms.common.api.Api;
import java.io.IOException;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzfg implements zzik {
    private final zzff zza;
    private int zzb;
    private int zzc;
    private int zzd = 0;

    private zzfg(zzff zzffVar) {
        byte[] bArr = zzgw.zzd;
        this.zza = zzffVar;
        zzffVar.zzc = this;
    }

    private final void zzP(Object obj, zzil zzilVar, zzfz zzfzVar) throws IOException {
        int i10 = this.zzc;
        this.zzc = ((this.zzb >>> 3) << 3) | 4;
        try {
            zzilVar.zzh(obj, this, zzfzVar);
            if (this.zzb == this.zzc) {
            } else {
                throw zzgy.zzg();
            }
        } finally {
            this.zzc = i10;
        }
    }

    private final void zzQ(Object obj, zzil zzilVar, zzfz zzfzVar) throws IOException {
        int zzn = this.zza.zzn();
        zzff zzffVar = this.zza;
        if (zzffVar.zza < zzffVar.zzb) {
            int zze = zzffVar.zze(zzn);
            this.zza.zza++;
            zzilVar.zzh(obj, this, zzfzVar);
            this.zza.zzz(0);
            r5.zza--;
            this.zza.zzA(zze);
            return;
        }
        throw new zzgy("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    private final void zzR(int i10) throws IOException {
        if (this.zza.zzd() == i10) {
        } else {
            throw zzgy.zzj();
        }
    }

    private final void zzS(int i10) throws IOException {
        if ((this.zzb & 7) == i10) {
        } else {
            throw zzgy.zza();
        }
    }

    private static final void zzT(int i10) throws IOException {
        if ((i10 & 3) == 0) {
        } else {
            throw zzgy.zzg();
        }
    }

    private static final void zzU(int i10) throws IOException {
        if ((i10 & 7) == 0) {
        } else {
            throw zzgy.zzg();
        }
    }

    public static zzfg zzq(zzff zzffVar) {
        zzfg zzfgVar = zzffVar.zzc;
        if (zzfgVar != null) {
            return zzfgVar;
        }
        return new zzfg(zzffVar);
    }

    @Override // com.google.android.recaptcha.internal.zzik
    public final void zzA(List list) throws IOException {
        int zzm;
        int zzm2;
        if (list instanceof zzhn) {
            zzhn zzhnVar = (zzhn) list;
            int i10 = this.zzb & 7;
            if (i10 != 1) {
                if (i10 == 2) {
                    int zzn = this.zza.zzn();
                    zzU(zzn);
                    int zzd = this.zza.zzd() + zzn;
                    do {
                        zzhnVar.zzf(this.zza.zzo());
                    } while (this.zza.zzd() < zzd);
                    return;
                }
                throw zzgy.zza();
            }
            do {
                zzhnVar.zzf(this.zza.zzo());
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
            throw zzgy.zza();
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

    @Override // com.google.android.recaptcha.internal.zzik
    public final void zzB(List list) throws IOException {
        int zzm;
        int zzm2;
        if (list instanceof zzgg) {
            zzgg zzggVar = (zzgg) list;
            int i10 = this.zzb & 7;
            if (i10 != 2) {
                if (i10 != 5) {
                    throw zzgy.zza();
                }
                do {
                    zzggVar.zze(this.zza.zzc());
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
                zzggVar.zze(this.zza.zzc());
            } while (this.zza.zzd() < zzd);
            return;
        }
        int i11 = this.zzb & 7;
        if (i11 != 2) {
            if (i11 != 5) {
                throw zzgy.zza();
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

    @Override // com.google.android.recaptcha.internal.zzik
    @Deprecated
    public final void zzC(List list, zzil zzilVar, zzfz zzfzVar) throws IOException {
        int zzm;
        int i10 = this.zzb;
        if ((i10 & 7) != 3) {
            throw zzgy.zza();
        }
        do {
            Object zze = zzilVar.zze();
            zzP(zze, zzilVar, zzfzVar);
            zzilVar.zzf(zze);
            list.add(zze);
            if (!this.zza.zzC() && this.zzd == 0) {
                zzm = this.zza.zzm();
            } else {
                return;
            }
        } while (zzm == i10);
        this.zzd = zzm;
    }

    @Override // com.google.android.recaptcha.internal.zzik
    public final void zzD(List list) throws IOException {
        int zzm;
        int zzm2;
        if (list instanceof zzgp) {
            zzgp zzgpVar = (zzgp) list;
            int i10 = this.zzb & 7;
            if (i10 != 0) {
                if (i10 == 2) {
                    int zzd = this.zza.zzd() + this.zza.zzn();
                    do {
                        zzgpVar.zzg(this.zza.zzh());
                    } while (this.zza.zzd() < zzd);
                    zzR(zzd);
                    return;
                }
                throw zzgy.zza();
            }
            do {
                zzgpVar.zzg(this.zza.zzh());
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
            throw zzgy.zza();
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

    @Override // com.google.android.recaptcha.internal.zzik
    public final void zzE(List list) throws IOException {
        int zzm;
        int zzm2;
        if (list instanceof zzhn) {
            zzhn zzhnVar = (zzhn) list;
            int i10 = this.zzb & 7;
            if (i10 != 0) {
                if (i10 == 2) {
                    int zzd = this.zza.zzd() + this.zza.zzn();
                    do {
                        zzhnVar.zzf(this.zza.zzp());
                    } while (this.zza.zzd() < zzd);
                    zzR(zzd);
                    return;
                }
                throw zzgy.zza();
            }
            do {
                zzhnVar.zzf(this.zza.zzp());
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
            throw zzgy.zza();
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

    @Override // com.google.android.recaptcha.internal.zzik
    public final void zzF(List list, zzil zzilVar, zzfz zzfzVar) throws IOException {
        int zzm;
        int i10 = this.zzb;
        if ((i10 & 7) != 2) {
            throw zzgy.zza();
        }
        do {
            Object zze = zzilVar.zze();
            zzQ(zze, zzilVar, zzfzVar);
            zzilVar.zzf(zze);
            list.add(zze);
            if (!this.zza.zzC() && this.zzd == 0) {
                zzm = this.zza.zzm();
            } else {
                return;
            }
        } while (zzm == i10);
        this.zzd = zzm;
    }

    @Override // com.google.android.recaptcha.internal.zzik
    public final void zzG(List list) throws IOException {
        int zzm;
        int zzm2;
        if (list instanceof zzgp) {
            zzgp zzgpVar = (zzgp) list;
            int i10 = this.zzb & 7;
            if (i10 != 2) {
                if (i10 != 5) {
                    throw zzgy.zza();
                }
                do {
                    zzgpVar.zzg(this.zza.zzk());
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
                zzgpVar.zzg(this.zza.zzk());
            } while (this.zza.zzd() < zzd);
            return;
        }
        int i11 = this.zzb & 7;
        if (i11 != 2) {
            if (i11 != 5) {
                throw zzgy.zza();
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

    @Override // com.google.android.recaptcha.internal.zzik
    public final void zzH(List list) throws IOException {
        int zzm;
        int zzm2;
        if (list instanceof zzhn) {
            zzhn zzhnVar = (zzhn) list;
            int i10 = this.zzb & 7;
            if (i10 != 1) {
                if (i10 == 2) {
                    int zzn = this.zza.zzn();
                    zzU(zzn);
                    int zzd = this.zza.zzd() + zzn;
                    do {
                        zzhnVar.zzf(this.zza.zzt());
                    } while (this.zza.zzd() < zzd);
                    return;
                }
                throw zzgy.zza();
            }
            do {
                zzhnVar.zzf(this.zza.zzt());
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
            throw zzgy.zza();
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

    @Override // com.google.android.recaptcha.internal.zzik
    public final void zzI(List list) throws IOException {
        int zzm;
        int zzm2;
        if (list instanceof zzgp) {
            zzgp zzgpVar = (zzgp) list;
            int i10 = this.zzb & 7;
            if (i10 != 0) {
                if (i10 == 2) {
                    int zzd = this.zza.zzd() + this.zza.zzn();
                    do {
                        zzgpVar.zzg(this.zza.zzl());
                    } while (this.zza.zzd() < zzd);
                    zzR(zzd);
                    return;
                }
                throw zzgy.zza();
            }
            do {
                zzgpVar.zzg(this.zza.zzl());
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
            throw zzgy.zza();
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

    @Override // com.google.android.recaptcha.internal.zzik
    public final void zzJ(List list) throws IOException {
        int zzm;
        int zzm2;
        if (list instanceof zzhn) {
            zzhn zzhnVar = (zzhn) list;
            int i10 = this.zzb & 7;
            if (i10 != 0) {
                if (i10 == 2) {
                    int zzd = this.zza.zzd() + this.zza.zzn();
                    do {
                        zzhnVar.zzf(this.zza.zzu());
                    } while (this.zza.zzd() < zzd);
                    zzR(zzd);
                    return;
                }
                throw zzgy.zza();
            }
            do {
                zzhnVar.zzf(this.zza.zzu());
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
            throw zzgy.zza();
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
            if ((list instanceof zzhg) && !z10) {
                zzhg zzhgVar = (zzhg) list;
                do {
                    zzhgVar.zzi(zzp());
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
        throw zzgy.zza();
    }

    @Override // com.google.android.recaptcha.internal.zzik
    public final void zzL(List list) throws IOException {
        int zzm;
        int zzm2;
        if (list instanceof zzgp) {
            zzgp zzgpVar = (zzgp) list;
            int i10 = this.zzb & 7;
            if (i10 != 0) {
                if (i10 == 2) {
                    int zzd = this.zza.zzd() + this.zza.zzn();
                    do {
                        zzgpVar.zzg(this.zza.zzn());
                    } while (this.zza.zzd() < zzd);
                    zzR(zzd);
                    return;
                }
                throw zzgy.zza();
            }
            do {
                zzgpVar.zzg(this.zza.zzn());
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
            throw zzgy.zza();
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

    @Override // com.google.android.recaptcha.internal.zzik
    public final void zzM(List list) throws IOException {
        int zzm;
        int zzm2;
        if (list instanceof zzhn) {
            zzhn zzhnVar = (zzhn) list;
            int i10 = this.zzb & 7;
            if (i10 != 0) {
                if (i10 == 2) {
                    int zzd = this.zza.zzd() + this.zza.zzn();
                    do {
                        zzhnVar.zzf(this.zza.zzv());
                    } while (this.zza.zzd() < zzd);
                    zzR(zzd);
                    return;
                }
                throw zzgy.zza();
            }
            do {
                zzhnVar.zzf(this.zza.zzv());
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
            throw zzgy.zza();
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

    @Override // com.google.android.recaptcha.internal.zzik
    public final boolean zzN() throws IOException {
        zzS(0);
        return this.zza.zzD();
    }

    @Override // com.google.android.recaptcha.internal.zzik
    public final boolean zzO() throws IOException {
        int i10;
        if (!this.zza.zzC() && (i10 = this.zzb) != this.zzc) {
            return this.zza.zzE(i10);
        }
        return false;
    }

    @Override // com.google.android.recaptcha.internal.zzik
    public final double zza() throws IOException {
        zzS(1);
        return this.zza.zzb();
    }

    @Override // com.google.android.recaptcha.internal.zzik
    public final float zzb() throws IOException {
        zzS(5);
        return this.zza.zzc();
    }

    @Override // com.google.android.recaptcha.internal.zzik
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

    @Override // com.google.android.recaptcha.internal.zzik
    public final int zzd() {
        return this.zzb;
    }

    @Override // com.google.android.recaptcha.internal.zzik
    public final int zze() throws IOException {
        zzS(0);
        return this.zza.zzf();
    }

    @Override // com.google.android.recaptcha.internal.zzik
    public final int zzf() throws IOException {
        zzS(5);
        return this.zza.zzg();
    }

    @Override // com.google.android.recaptcha.internal.zzik
    public final int zzg() throws IOException {
        zzS(0);
        return this.zza.zzh();
    }

    @Override // com.google.android.recaptcha.internal.zzik
    public final int zzh() throws IOException {
        zzS(5);
        return this.zza.zzk();
    }

    @Override // com.google.android.recaptcha.internal.zzik
    public final int zzi() throws IOException {
        zzS(0);
        return this.zza.zzl();
    }

    @Override // com.google.android.recaptcha.internal.zzik
    public final int zzj() throws IOException {
        zzS(0);
        return this.zza.zzn();
    }

    @Override // com.google.android.recaptcha.internal.zzik
    public final long zzk() throws IOException {
        zzS(1);
        return this.zza.zzo();
    }

    @Override // com.google.android.recaptcha.internal.zzik
    public final long zzl() throws IOException {
        zzS(0);
        return this.zza.zzp();
    }

    @Override // com.google.android.recaptcha.internal.zzik
    public final long zzm() throws IOException {
        zzS(1);
        return this.zza.zzt();
    }

    @Override // com.google.android.recaptcha.internal.zzik
    public final long zzn() throws IOException {
        zzS(0);
        return this.zza.zzu();
    }

    @Override // com.google.android.recaptcha.internal.zzik
    public final long zzo() throws IOException {
        zzS(0);
        return this.zza.zzv();
    }

    @Override // com.google.android.recaptcha.internal.zzik
    public final zzez zzp() throws IOException {
        zzS(2);
        return this.zza.zzw();
    }

    @Override // com.google.android.recaptcha.internal.zzik
    public final String zzr() throws IOException {
        zzS(2);
        return this.zza.zzx();
    }

    @Override // com.google.android.recaptcha.internal.zzik
    public final String zzs() throws IOException {
        zzS(2);
        return this.zza.zzy();
    }

    @Override // com.google.android.recaptcha.internal.zzik
    public final void zzt(Object obj, zzil zzilVar, zzfz zzfzVar) throws IOException {
        zzS(3);
        zzP(obj, zzilVar, zzfzVar);
    }

    @Override // com.google.android.recaptcha.internal.zzik
    public final void zzu(Object obj, zzil zzilVar, zzfz zzfzVar) throws IOException {
        zzS(2);
        zzQ(obj, zzilVar, zzfzVar);
    }

    @Override // com.google.android.recaptcha.internal.zzik
    public final void zzv(List list) throws IOException {
        int zzm;
        int zzm2;
        if (list instanceof zzeo) {
            zzeo zzeoVar = (zzeo) list;
            int i10 = this.zzb & 7;
            if (i10 != 0) {
                if (i10 == 2) {
                    int zzd = this.zza.zzd() + this.zza.zzn();
                    do {
                        zzeoVar.zze(this.zza.zzD());
                    } while (this.zza.zzd() < zzd);
                    zzR(zzd);
                    return;
                }
                throw zzgy.zza();
            }
            do {
                zzeoVar.zze(this.zza.zzD());
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
            throw zzgy.zza();
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

    @Override // com.google.android.recaptcha.internal.zzik
    public final void zzw(List list) throws IOException {
        int zzm;
        if ((this.zzb & 7) != 2) {
            throw zzgy.zza();
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

    @Override // com.google.android.recaptcha.internal.zzik
    public final void zzx(List list) throws IOException {
        int zzm;
        int zzm2;
        if (list instanceof zzft) {
            zzft zzftVar = (zzft) list;
            int i10 = this.zzb & 7;
            if (i10 != 1) {
                if (i10 == 2) {
                    int zzn = this.zza.zzn();
                    zzU(zzn);
                    int zzd = this.zza.zzd() + zzn;
                    do {
                        zzftVar.zze(this.zza.zzb());
                    } while (this.zza.zzd() < zzd);
                    return;
                }
                throw zzgy.zza();
            }
            do {
                zzftVar.zze(this.zza.zzb());
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
            throw zzgy.zza();
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

    @Override // com.google.android.recaptcha.internal.zzik
    public final void zzy(List list) throws IOException {
        int zzm;
        int zzm2;
        if (list instanceof zzgp) {
            zzgp zzgpVar = (zzgp) list;
            int i10 = this.zzb & 7;
            if (i10 != 0) {
                if (i10 == 2) {
                    int zzd = this.zza.zzd() + this.zza.zzn();
                    do {
                        zzgpVar.zzg(this.zza.zzf());
                    } while (this.zza.zzd() < zzd);
                    zzR(zzd);
                    return;
                }
                throw zzgy.zza();
            }
            do {
                zzgpVar.zzg(this.zza.zzf());
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
            throw zzgy.zza();
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

    @Override // com.google.android.recaptcha.internal.zzik
    public final void zzz(List list) throws IOException {
        int zzm;
        int zzm2;
        if (list instanceof zzgp) {
            zzgp zzgpVar = (zzgp) list;
            int i10 = this.zzb & 7;
            if (i10 != 2) {
                if (i10 != 5) {
                    throw zzgy.zza();
                }
                do {
                    zzgpVar.zzg(this.zza.zzg());
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
                zzgpVar.zzg(this.zza.zzg());
            } while (this.zza.zzd() < zzd);
            return;
        }
        int i11 = this.zzb & 7;
        if (i11 != 2) {
            if (i11 != 5) {
                throw zzgy.zza();
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
