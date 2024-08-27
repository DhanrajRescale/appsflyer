package bf;

import android.view.View;
import android.widget.ImageView;
import androidx.lifecycle.f0;
import androidx.lifecycle.v;
import ba.zc;
import com.assetgro.stockgro.ui.drawer.stockgyan.adapter.StockGyanGroupsItemViewModel;
import gd.o;
import hk.w;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import xj.h;

/* loaded from: classes.dex */
public final class d extends o {

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f6963y = 0;

    /* renamed from: x, reason: collision with root package name */
    public final Function1 f6964x;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public d(androidx.recyclerview.widget.RecyclerView r5, kotlin.jvm.functions.Function1 r6) {
        /*
            r4 = this;
            java.lang.String r0 = "parent"
            java.lang.String r1 = "onItemClick"
            android.view.LayoutInflater r0 = da.e.g(r5, r0, r6, r1)
            int r1 = ba.zc.f6840u
            androidx.databinding.DataBinderMapperImpl r1 = m4.d.f27474a
            r1 = 0
            r2 = 0
            r3 = 2131558637(0x7f0d00ed, float:1.8742595E38)
            m4.m r5 = m4.m.g(r0, r3, r5, r2, r1)
            ba.zc r5 = (ba.zc) r5
            java.lang.String r0 = "inflate(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r0)
            r4.<init>(r5)
            r4.f6964x = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: bf.d.<init>(androidx.recyclerview.widget.RecyclerView, kotlin.jvm.functions.Function1):void");
    }

    @Override // gd.o
    public final void w(da.a viewHolderComponent) {
        Intrinsics.checkNotNullParameter(viewHolderComponent, "viewHolderComponent");
        this.f17292v = new StockGyanGroupsItemViewModel(viewHolderComponent.f14246a.k(), viewHolderComponent.f14246a.c());
        this.f17293w = (v) ((xs.b) viewHolderComponent.f14248c).get();
    }

    @Override // gd.o
    public final void x() {
        super.x();
        StockGyanGroupsItemViewModel stockGyanGroupsItemViewModel = (StockGyanGroupsItemViewModel) v();
        final int i10 = 0;
        stockGyanGroupsItemViewModel.f9511g.observe(this, new f0(this) { // from class: bf.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f6962b;

            {
                this.f6962b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                int i11 = i10;
                d this$0 = this.f6962b;
                switch (i11) {
                    case 0:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        ((zc) this$0.f17291u).f6842t.setText((String) obj);
                        return;
                    default:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        nk.a t10 = new nk.a().t(new h(new Object(), new w(16)), true);
                        Intrinsics.checkNotNullExpressionValue(t10, "transforms(...)");
                        ImageView imageView = ((zc) this$0.f17291u).f6841s;
                        com.bumptech.glide.b.f(imageView).m((String) obj).w(t10).z(imageView);
                        return;
                }
            }
        });
        StockGyanGroupsItemViewModel stockGyanGroupsItemViewModel2 = (StockGyanGroupsItemViewModel) v();
        final int i11 = 1;
        stockGyanGroupsItemViewModel2.f9512h.observe(this, new f0(this) { // from class: bf.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f6962b;

            {
                this.f6962b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                int i112 = i11;
                d this$0 = this.f6962b;
                switch (i112) {
                    case 0:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        ((zc) this$0.f17291u).f6842t.setText((String) obj);
                        return;
                    default:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        nk.a t10 = new nk.a().t(new h(new Object(), new w(16)), true);
                        Intrinsics.checkNotNullExpressionValue(t10, "transforms(...)");
                        ImageView imageView = ((zc) this$0.f17291u).f6841s;
                        com.bumptech.glide.b.f(imageView).m((String) obj).w(t10).z(imageView);
                        return;
                }
            }
        });
    }

    @Override // gd.o
    public final void y(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f22629a.setOnClickListener(new jd.a(this, 28));
    }
}
