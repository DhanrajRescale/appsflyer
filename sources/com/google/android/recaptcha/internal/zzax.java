package com.google.android.recaptcha.internal;

import au.i;
import hl.f;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import qu.f0;
import ut.n;
import vt.g0;
import yt.a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzax extends i implements Function2 {
    int zza;
    final /* synthetic */ zzba zzb;
    final /* synthetic */ List zzc;
    final /* synthetic */ zzn zzd;
    final /* synthetic */ zzn zze;
    private /* synthetic */ Object zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzax(zzba zzbaVar, List list, zzn zznVar, zzn zznVar2, a aVar) {
        super(2, aVar);
        this.zzb = zzbaVar;
        this.zzc = list;
        this.zzd = zznVar;
        this.zze = zznVar2;
    }

    @Override // au.a
    @NotNull
    public final a create(Object obj, @NotNull a aVar) {
        zzax zzaxVar = new zzax(this.zzb, this.zzc, this.zzd, this.zze, aVar);
        zzaxVar.zzf = obj;
        return zzaxVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzax) create((f0) obj, (a) obj2)).invokeSuspend(Unit.f23355a);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:23:0x006c. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:24:0x006f. Please report as an issue. */
    @Override // au.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object zzu;
        boolean zzw;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.zza;
        n.b(obj);
        if (i10 == 0) {
            f0 f0Var = (f0) this.zzf;
            zzbl zzblVar = new zzbl(this.zzb.zzb());
            zzdk zzb = zzdk.zzb();
            while (zzblVar.zzb() >= 0 && zzblVar.zzb() < this.zzc.size() && f.u0(f0Var)) {
                zzmv zzmvVar = (zzmv) this.zzc.get(zzblVar.zzb());
                try {
                    int zzk = zzmvVar.zzk();
                    int zzg = zzmvVar.zzg();
                    List zzj = zzmvVar.zzj();
                    zzw = this.zzb.zzw(zzmvVar, zzblVar);
                    if (!zzw) {
                        zzdk zzb2 = zzdk.zzb();
                        int i11 = zzk - 2;
                        if (i11 != 7) {
                            if (i11 != 15) {
                                if (i11 != 30) {
                                    if (i11 != 40) {
                                        switch (i11) {
                                            case 10:
                                                zzba.zzm(this.zzb, zzg, zzj);
                                                break;
                                            case 11:
                                                zzba.zzn(this.zzb, zzg, zzj);
                                                break;
                                            case 12:
                                                zzba.zzp(this.zzb, zzj);
                                                break;
                                            case 13:
                                                zzba.zzq(this.zzb, zzj);
                                                break;
                                            default:
                                                switch (i11) {
                                                    case 18:
                                                        zzba.zzk(this.zzb, zzg, zzj);
                                                        break;
                                                    case 19:
                                                        zzba.zzl(this.zzb, zzg, zzj);
                                                        break;
                                                    case 20:
                                                        zzba.zzj(this.zzb, zzj);
                                                        break;
                                                    default:
                                                        throw new zzt(5, 2, null);
                                                }
                                        }
                                    } else {
                                        zzba.zzr(this.zzb, this.zzd, zzg, zzj);
                                    }
                                } else {
                                    zzba.zzh(this.zzb, zzg, zzj);
                                }
                            } else {
                                zzba.zzi(this.zzb, zzj);
                            }
                        } else {
                            zzba.zzo(this.zzb, zzg, zzj);
                        }
                        zzb2.zzf();
                        long zza = zzb2.zza(TimeUnit.MICROSECONDS);
                        zzj zzjVar = zzj.zza;
                        zzj.zza(zzms.zza(zzk), zza);
                        new Long(zza);
                        new Integer(zzg);
                        g0.B(zzj, null, null, null, new zzaw(this.zzb), 31);
                        zzblVar.zzg(zzblVar.zzb() + 1);
                    }
                } catch (Exception e10) {
                    zzba zzbaVar = this.zzb;
                    String zzd = zzblVar.zzd();
                    zzn zznVar = this.zzd;
                    zzn zznVar2 = this.zze;
                    int zzb3 = zzblVar.zzb();
                    this.zza = 1;
                    zzu = zzbaVar.zzu(e10, zzd, zznVar, zznVar2, zzb3, this);
                    if (zzu == aVar) {
                        return aVar;
                    }
                }
            }
            zzb.zzf();
            new Long(zzb.zza(TimeUnit.MICROSECONDS));
            return Unit.f23355a;
        }
        return Unit.f23355a;
    }
}
