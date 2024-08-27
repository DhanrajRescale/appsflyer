package com.google.android.recaptcha.internal;

import android.content.ContentValues;
import au.i;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import qu.f0;
import ut.n;
import vt.g0;
import yt.a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzan extends i implements Function2 {
    final /* synthetic */ zzkx zza;
    final /* synthetic */ zzao zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzan(zzkx zzkxVar, zzao zzaoVar, a aVar) {
        super(2, aVar);
        this.zza = zzkxVar;
        this.zzb = zzaoVar;
    }

    @Override // au.a
    @NotNull
    public final a create(Object obj, @NotNull a aVar) {
        return new zzan(this.zza, this.zzb, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzan) create((f0) obj, (a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(@NotNull Object obj) {
        zzad zzadVar;
        zzad zzadVar2;
        zzad zzadVar3;
        zzad zzadVar4;
        zzad zzadVar5;
        zt.a aVar = zt.a.f42823a;
        n.b(obj);
        zzkx zzkxVar = this.zza;
        zzao zzaoVar = this.zzb;
        synchronized (zzaj.class) {
            try {
                byte[] zzd = zzkxVar.zzd();
                zzae zzaeVar = new zzae(zzeb.zzg().zzi(zzd, 0, zzd.length), System.currentTimeMillis(), 0);
                zzadVar = zzaoVar.zze;
                ContentValues contentValues = new ContentValues();
                contentValues.put("ss", zzaeVar.zzc());
                contentValues.put("ts", Long.valueOf(zzaeVar.zzb()));
                zzadVar.getWritableDatabase().insert("ce", null, contentValues);
                zzadVar2 = zzaoVar.zze;
                int zzb = zzadVar2.zzb() - 500;
                if (zzb > 0) {
                    zzadVar4 = zzaoVar.zze;
                    List N = g0.N(zzadVar4.zzd(), zzb);
                    zzadVar5 = zzaoVar.zze;
                    zzadVar5.zza(N);
                }
                zzadVar3 = zzaoVar.zze;
                if (zzadVar3.zzb() >= 20) {
                    zzaoVar.zzg();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return Unit.f23355a;
    }
}
