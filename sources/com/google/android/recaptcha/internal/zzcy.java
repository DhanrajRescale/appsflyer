package com.google.android.recaptcha.internal;

import android.content.Context;
import au.i;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import qu.f0;
import ut.n;
import yt.a;

/* loaded from: classes2.dex */
final class zzcy extends i implements Function2 {
    Object zza;
    Object zzb;
    Object zzc;
    int zzd;
    final /* synthetic */ zzda zze;
    final /* synthetic */ String zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcy(zzda zzdaVar, String str, a aVar) {
        super(2, aVar);
        this.zze = zzdaVar;
        this.zzf = str;
    }

    @Override // au.a
    @NotNull
    public final a create(Object obj, @NotNull a aVar) {
        return new zzcy(this.zze, this.zzf, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzcy) create((f0) obj, (a) obj2)).invokeSuspend(Unit.f23355a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [yu.a] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [yu.a] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object] */
    @Override // au.a
    public final Object invokeSuspend(@NotNull Object obj) {
        yu.a aVar;
        String str;
        Object obj2;
        ?? r02;
        zzr zzrVar;
        String str2;
        String str3;
        String str4;
        Context context;
        zzr zzrVar2;
        zt.a aVar2 = zt.a.f42823a;
        int i10 = this.zzd;
        try {
            if (i10 != 0) {
                if (i10 != 1) {
                    r02 = this.zza;
                    try {
                        n.b(obj);
                        r02 = r02;
                        Unit unit = Unit.f23355a;
                        r02.a(null);
                        return Unit.f23355a;
                    } catch (Throwable th2) {
                        th = th2;
                        r02.a(null);
                        throw th;
                    }
                }
                ?? r12 = this.zzc;
                obj2 = this.zzb;
                ?? r42 = this.zza;
                n.b(obj);
                str = r12;
                aVar = r42;
            } else {
                n.b(obj);
                zzda zzdaVar = this.zze;
                aVar = zzdaVar.zzo;
                str = this.zzf;
                this.zza = aVar;
                this.zzb = zzdaVar;
                this.zzc = str;
                this.zzd = 1;
                if (aVar.b(null, this) != aVar2) {
                    obj2 = zzdaVar;
                } else {
                    return aVar2;
                }
            }
            zzrVar = ((zzda) obj2).zzf;
            String zzb = zzrVar.zzb();
            str2 = ((zzda) obj2).zzd;
            str3 = ((zzda) obj2).zzh;
            str4 = ((zzda) obj2).zzg;
            context = ((zzda) obj2).zze;
            zzrVar2 = ((zzda) obj2).zzf;
            this.zza = aVar;
            this.zzb = null;
            this.zzc = null;
            this.zzd = 2;
            if (zzbj.zzb(zzb, str2, str, str3, str4, context, zzrVar2, this) != aVar2) {
                r02 = aVar;
                Unit unit2 = Unit.f23355a;
                r02.a(null);
                return Unit.f23355a;
            }
            return aVar2;
        } catch (Throwable th3) {
            th = th3;
            r02 = aVar;
            r02.a(null);
            throw th;
        }
    }
}
