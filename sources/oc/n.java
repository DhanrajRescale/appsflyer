package oc;

import android.content.Context;
import android.view.LayoutInflater;
import androidx.databinding.DataBinderMapperImpl;
import androidx.recyclerview.widget.RecyclerView;
import ba.h7;
import ba.i7;
import com.assetgro.stockgro.data.model.arenaV2.ArenaSection;
import com.assetgro.stockgro.feature_arena.widget.PrepZoneWhatsNewWidget;
import com.assetgro.stockgro.prod.R;
import d7.v;
import in.juspay.hyper.constants.LogCategory;
import k7.w;
import k7.y1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class n extends v {

    /* renamed from: g, reason: collision with root package name */
    public final d f29955g;

    /* renamed from: h, reason: collision with root package name */
    public final e f29956h;

    /* renamed from: i, reason: collision with root package name */
    public final c f29957i;

    /* renamed from: j, reason: collision with root package name */
    public final k f29958j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v5, types: [k7.w, java.lang.Object] */
    public n(String assetType, d listener, e achievementListener, c refreshListener, k arenaMyLeaguesGoToProfileListener) {
        super((w) new Object());
        Intrinsics.checkNotNullParameter(assetType, "assetType");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(achievementListener, "achievementListener");
        Intrinsics.checkNotNullParameter(refreshListener, "refreshListener");
        Intrinsics.checkNotNullParameter(arenaMyLeaguesGoToProfileListener, "arenaMyLeaguesGoToProfileListener");
        this.f29955g = listener;
        this.f29956h = achievementListener;
        this.f29957i = refreshListener;
        this.f29958j = arenaMyLeaguesGoToProfileListener;
    }

    @Override // k7.z0
    public final void h(y1 y1Var, int i10) {
        l holder = (l) y1Var;
        Intrinsics.checkNotNullParameter(holder, "holder");
        i7 i7Var = (i7) holder.f29954u;
        i7Var.A = this.f29955g;
        synchronized (i7Var) {
            i7Var.I |= 2;
        }
        i7Var.a(12);
        i7Var.m();
        i7 i7Var2 = (i7) holder.f29954u;
        i7Var2.B = this.f29956h;
        synchronized (i7Var2) {
            i7Var2.I |= 1;
        }
        i7Var2.a(1);
        i7Var2.m();
        i7 i7Var3 = (i7) holder.f29954u;
        i7Var3.C = this.f29957i;
        synchronized (i7Var3) {
            i7Var3.I |= 32;
        }
        i7Var3.a(17);
        i7Var3.m();
        i7 i7Var4 = (i7) holder.f29954u;
        i7Var4.D = this.f29958j;
        synchronized (i7Var4) {
            i7Var4.I |= 8;
        }
        i7Var4.a(8);
        i7Var4.m();
        holder.f29954u.s((ArenaSection) q(i10));
        holder.f29954u.r(a());
        if (!kj.a.f23207b) {
            if (i10 == 0) {
                PrepZoneWhatsNewWidget whatsNewPrepzone = holder.f29954u.f4908z;
                Intrinsics.checkNotNullExpressionValue(whatsNewPrepzone, "whatsNewPrepzone");
                zq.f.m0(whatsNewPrepzone);
            } else {
                PrepZoneWhatsNewWidget whatsNewPrepzone2 = holder.f29954u.f4908z;
                Intrinsics.checkNotNullExpressionValue(whatsNewPrepzone2, "whatsNewPrepzone");
                zq.f.M(whatsNewPrepzone2);
            }
        }
    }

    @Override // d7.v, k7.z0
    public final y1 i(int i10, RecyclerView parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        if (context != null) {
            LayoutInflater from = LayoutInflater.from(context);
            int i11 = h7.G;
            DataBinderMapperImpl dataBinderMapperImpl = m4.d.f27474a;
            h7 h7Var = (h7) m4.m.g(from, R.layout.cell_arena_my_league_middle_layer, parent, false, null);
            Intrinsics.checkNotNullExpressionValue(h7Var, "inflate(...)");
            return new l(h7Var);
        }
        Intrinsics.k(LogCategory.CONTEXT);
        throw null;
    }
}
