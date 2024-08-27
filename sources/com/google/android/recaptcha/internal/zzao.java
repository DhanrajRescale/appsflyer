package com.google.android.recaptcha.internal;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.Timer;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qu.f0;
import vt.h0;
import vt.w0;
import yk.g;
import zt.f;

/* loaded from: classes2.dex */
public final class zzao implements zzaj {

    @NotNull
    public static final zzak zza = new zzak(null);
    private static Timer zzb;

    @NotNull
    private final zzap zzc;

    @NotNull
    private final f0 zzd;

    @NotNull
    private final zzad zze;

    public /* synthetic */ zzao(Context context, zzap zzapVar, f0 f0Var, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        zzad zzadVar;
        f0 zza2 = zzp.zza();
        this.zzc = zzapVar;
        this.zzd = zza2;
        zzadVar = zzad.zzb;
        zzadVar = zzadVar == null ? new zzad(context, null) : zzadVar;
        zzad.zzb = zzadVar;
        this.zze = zzadVar;
        zzh();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r1v4, types: [yt.a, java.lang.Object, pu.h] */
    public final void zzg() {
        h0 h0Var;
        ArrayList<List> arrayList;
        int i10;
        List zzd = this.zze.zzd();
        Intrinsics.checkNotNullParameter(zzd, "<this>");
        if ((zzd instanceof RandomAccess) && (zzd instanceof List)) {
            int size = zzd.size();
            int i11 = size / 20;
            if (size % 20 == 0) {
                i10 = 0;
            } else {
                i10 = 1;
            }
            arrayList = new ArrayList(i11 + i10);
            for (int i12 = 0; i12 >= 0 && i12 < size; i12 += 20) {
                int i13 = size - i12;
                if (20 <= i13) {
                    i13 = 20;
                }
                ArrayList arrayList2 = new ArrayList(i13);
                for (int i14 = 0; i14 < i13; i14++) {
                    arrayList2.add(zzd.get(i14 + i12));
                }
                arrayList.add(arrayList2);
            }
        } else {
            ArrayList arrayList3 = new ArrayList();
            Iterator iterator = zzd.iterator();
            Intrinsics.checkNotNullParameter(iterator, "iterator");
            if (!iterator.hasNext()) {
                h0Var = h0.f38319a;
            } else {
                w0 block = new w0(20, 20, iterator, false, true, null);
                Intrinsics.checkNotNullParameter(block, "block");
                ?? obj = new Object();
                obj.f31430d = f.a(obj, obj, block);
                h0Var = obj;
            }
            while (h0Var.hasNext()) {
                arrayList3.add((List) h0Var.next());
            }
            arrayList = arrayList3;
        }
        for (List list : arrayList) {
            zzkz zzf = zzla.zzf();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                zzf.zzd(zzkx.zzG(zzeb.zzg().zzj(((zzae) it.next()).zzc())));
            }
            if (this.zzc.zza(((zzla) zzf.zzj()).zzd())) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    this.zze.zzf((zzae) it2.next());
                }
            }
        }
    }

    private final void zzh() {
        if (zzb == null) {
            Timer timer = new Timer();
            zzb = timer;
            timer.schedule(new zzal(this), 120000L, 120000L);
        }
    }

    public final void zzf(@NotNull zzkx zzkxVar) {
        g.H(this.zzd, null, null, new zzan(zzkxVar, this, null), 3);
        zzh();
    }
}
