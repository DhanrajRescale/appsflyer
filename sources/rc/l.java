package rc;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.TextView;
import androidx.databinding.DataBinderMapperImpl;
import androidx.recyclerview.widget.RecyclerView;
import ba.m7;
import ba.n7;
import com.assetgro.stockgro.data.model.arenaV2.ArenaSection;
import com.assetgro.stockgro.feature_arena.widget.PrepZoneWhatsNewWidget;
import com.assetgro.stockgro.prod.R;
import g7.f3;
import in.juspay.hyper.constants.LogCategory;
import k7.y1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class l extends f3 {

    /* renamed from: l, reason: collision with root package name */
    public static final ga.a f33597l = new ga.a(4);

    /* renamed from: g, reason: collision with root package name */
    public final String f33598g;

    /* renamed from: h, reason: collision with root package name */
    public final d f33599h;

    /* renamed from: i, reason: collision with root package name */
    public final i f33600i;

    /* renamed from: j, reason: collision with root package name */
    public final j f33601j;

    /* renamed from: k, reason: collision with root package name */
    public final e f33602k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(String assetType, d innerAdapterListener, i disableHorizontalScrollListener, j sortButtonClicked, e refreshListener) {
        super(f33597l);
        Intrinsics.checkNotNullParameter(assetType, "assetType");
        Intrinsics.checkNotNullParameter(innerAdapterListener, "innerAdapterListener");
        Intrinsics.checkNotNullParameter(disableHorizontalScrollListener, "disableHorizontalScrollListener");
        Intrinsics.checkNotNullParameter(sortButtonClicked, "sortButtonClicked");
        Intrinsics.checkNotNullParameter(refreshListener, "refreshListener");
        this.f33598g = assetType;
        this.f33599h = innerAdapterListener;
        this.f33600i = disableHorizontalScrollListener;
        this.f33601j = sortButtonClicked;
        this.f33602k = refreshListener;
    }

    @Override // k7.z0
    public final void h(y1 y1Var, int i10) {
        k holder = (k) y1Var;
        Intrinsics.checkNotNullParameter(holder, "holder");
        ArenaSection arenaSection = (ArenaSection) q(i10);
        holder.f33596u.r(arenaSection);
        n7 n7Var = (n7) holder.f33596u;
        n7Var.B = this.f33598g;
        synchronized (n7Var) {
            n7Var.H |= 2;
        }
        n7Var.a(3);
        n7Var.m();
        n7 n7Var2 = (n7) holder.f33596u;
        n7Var2.D = this.f33599h;
        synchronized (n7Var2) {
            n7Var2.H |= 1;
        }
        n7Var2.a(12);
        n7Var2.m();
        holder.f33596u.getClass();
        n7 n7Var3 = (n7) holder.f33596u;
        n7Var3.E = this.f33602k;
        synchronized (n7Var3) {
            n7Var3.H |= 32;
        }
        n7Var3.a(17);
        n7Var3.m();
        holder.f33596u.f5441u.setOnClickListener(new d7.j(this, 21));
        holder.f33596u.r(arenaSection);
        n7 n7Var4 = (n7) holder.f33596u;
        n7Var4.C = this.f33600i;
        synchronized (n7Var4) {
            n7Var4.H |= 8;
        }
        n7Var4.a(20);
        n7Var4.m();
        if (kj.a.f23207b) {
            TextView extraTitle = holder.f33596u.f5439s;
            Intrinsics.checkNotNullExpressionValue(extraTitle, "extraTitle");
            zq.f.m0(extraTitle);
            return;
        }
        if (i10 == 0) {
            PrepZoneWhatsNewWidget whatsNewPrepzone = holder.f33596u.A;
            Intrinsics.checkNotNullExpressionValue(whatsNewPrepzone, "whatsNewPrepzone");
            zq.f.m0(whatsNewPrepzone);
        } else {
            PrepZoneWhatsNewWidget whatsNewPrepzone2 = holder.f33596u.A;
            Intrinsics.checkNotNullExpressionValue(whatsNewPrepzone2, "whatsNewPrepzone");
            zq.f.M(whatsNewPrepzone2);
        }
        TextView extraTitle2 = holder.f33596u.f5439s;
        Intrinsics.checkNotNullExpressionValue(extraTitle2, "extraTitle");
        zq.f.M(extraTitle2);
    }

    @Override // k7.z0
    public final y1 i(int i10, RecyclerView parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        if (context != null) {
            LayoutInflater from = LayoutInflater.from(context);
            int i11 = m7.G;
            DataBinderMapperImpl dataBinderMapperImpl = m4.d.f27474a;
            m7 m7Var = (m7) m4.m.g(from, R.layout.cell_arena_upcoming_middle_layer, parent, false, null);
            Intrinsics.checkNotNullExpressionValue(m7Var, "inflate(...)");
            return new k(m7Var);
        }
        Intrinsics.k(LogCategory.CONTEXT);
        throw null;
    }
}
