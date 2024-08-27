package rh;

import android.content.Intent;
import android.net.Uri;
import android.util.Patterns;
import android.view.View;
import android.widget.ImageView;
import androidx.lifecycle.v;
import ba.zb;
import com.assetgro.stockgro.data.model.RedeemedOffers;
import com.assetgro.stockgro.ui.redemption.orders.RedeemedOfferItemViewModel;
import gd.o;
import kotlin.jvm.internal.Intrinsics;
import m4.m;
import r3.k;

/* loaded from: classes.dex */
public final class d extends o {

    /* renamed from: x, reason: collision with root package name */
    public final f f33740x;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public d(androidx.recyclerview.widget.RecyclerView r5, rh.f r6) {
        /*
            r4 = this;
            java.lang.String r0 = "parent"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "callback"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            android.content.Context r0 = r5.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            int r1 = ba.zb.B
            androidx.databinding.DataBinderMapperImpl r1 = m4.d.f27474a
            r1 = 0
            r2 = 0
            r3 = 2131558624(0x7f0d00e0, float:1.874257E38)
            m4.m r5 = m4.m.g(r0, r3, r5, r2, r1)
            ba.zb r5 = (ba.zb) r5
            java.lang.String r0 = "inflate(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r0)
            r4.<init>(r5)
            r4.f33740x = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rh.d.<init>(androidx.recyclerview.widget.RecyclerView, rh.f):void");
    }

    @Override // gd.o
    public final void w(da.a viewHolderComponent) {
        Intrinsics.checkNotNullParameter(viewHolderComponent, "viewHolderComponent");
        this.f17292v = new RedeemedOfferItemViewModel(viewHolderComponent.f14246a.k(), viewHolderComponent.f14246a.c());
        this.f17293w = (v) ((xs.b) viewHolderComponent.f14248c).get();
    }

    @Override // gd.o
    public final void x() {
        super.x();
        RedeemedOfferItemViewModel redeemedOfferItemViewModel = (RedeemedOfferItemViewModel) v();
        redeemedOfferItemViewModel.f10097g.observe(this, new ch.c(19, new c(this, 0)));
        RedeemedOfferItemViewModel redeemedOfferItemViewModel2 = (RedeemedOfferItemViewModel) v();
        redeemedOfferItemViewModel2.f10098h.observe(this, new ch.c(19, new c(this, 1)));
        RedeemedOfferItemViewModel redeemedOfferItemViewModel3 = (RedeemedOfferItemViewModel) v();
        redeemedOfferItemViewModel3.f10099i.observe(this, new ch.c(19, new c(this, 2)));
        RedeemedOfferItemViewModel redeemedOfferItemViewModel4 = (RedeemedOfferItemViewModel) v();
        redeemedOfferItemViewModel4.f10100j.observe(this, new ch.c(19, new c(this, 3)));
        RedeemedOfferItemViewModel redeemedOfferItemViewModel5 = (RedeemedOfferItemViewModel) v();
        redeemedOfferItemViewModel5.f10102l.observe(this, new ch.c(19, new c(this, 4)));
        RedeemedOfferItemViewModel redeemedOfferItemViewModel6 = (RedeemedOfferItemViewModel) v();
        redeemedOfferItemViewModel6.f10103m.observe(this, new ch.c(19, new c(this, 5)));
        RedeemedOfferItemViewModel redeemedOfferItemViewModel7 = (RedeemedOfferItemViewModel) v();
        redeemedOfferItemViewModel7.f10101k.observe(this, new ch.c(19, new c(this, 6)));
    }

    @Override // gd.o
    public final void y(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        RedeemedOffers redeemedOffers = (RedeemedOffers) ((RedeemedOfferItemViewModel) v()).f9075c.getValue();
        final int i10 = 0;
        m mVar = this.f17291u;
        if (redeemedOffers != null) {
            String couponCode = redeemedOffers.getCouponCode();
            Intrinsics.checkNotNullParameter(couponCode, "<this>");
            if (Patterns.WEB_URL.matcher(couponCode).matches()) {
                zb zbVar = (zb) mVar;
                zbVar.f6832s.setVisibility(8);
                zbVar.f6837x.setVisibility(8);
            } else {
                zb zbVar2 = (zb) mVar;
                zbVar2.f6832s.setVisibility(0);
                zbVar2.f6837x.setVisibility(0);
            }
        }
        zb zbVar3 = (zb) mVar;
        zbVar3.A.setOnClickListener(new View.OnClickListener(this) { // from class: rh.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f33737b;

            {
                this.f33737b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i11 = i10;
                d this$0 = this.f33737b;
                switch (i11) {
                    case 0:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        RedeemedOffers redeemedOffers2 = (RedeemedOffers) ((RedeemedOfferItemViewModel) this$0.v()).f9075c.getValue();
                        if (redeemedOffers2 != null) {
                            String couponCode2 = redeemedOffers2.getCouponCode();
                            Intrinsics.checkNotNullParameter(couponCode2, "<this>");
                            boolean matches = Patterns.WEB_URL.matcher(couponCode2).matches();
                            View view3 = this$0.f22629a;
                            if (matches) {
                                String url = redeemedOffers2.getCouponCode();
                                Intrinsics.checkNotNullParameter(url, "url");
                                k.startActivity(view3.getContext(), new Intent("android.intent.action.VIEW", Uri.parse(url)), null);
                                return;
                            }
                            String url2 = redeemedOffers2.getVendor().getSiteURL();
                            Intrinsics.checkNotNullParameter(url2, "url");
                            k.startActivity(view3.getContext(), new Intent("android.intent.action.VIEW", Uri.parse(url2)), null);
                            return;
                        }
                        return;
                    default:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        RedeemedOffers redeemedOffers3 = (RedeemedOffers) ((RedeemedOfferItemViewModel) this$0.v()).f9075c.getValue();
                        if (redeemedOffers3 != null) {
                            String text = redeemedOffers3.getCouponCode();
                            f fVar = this$0.f33740x;
                            fVar.getClass();
                            Intrinsics.checkNotNullParameter(text, "text");
                            fVar.f33751a.f33752h.invoke(text);
                            return;
                        }
                        return;
                }
            }
        });
        ImageView imageView = zbVar3.f6837x;
        final int i11 = 1;
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: rh.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f33737b;

            {
                this.f33737b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i112 = i11;
                d this$0 = this.f33737b;
                switch (i112) {
                    case 0:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        RedeemedOffers redeemedOffers2 = (RedeemedOffers) ((RedeemedOfferItemViewModel) this$0.v()).f9075c.getValue();
                        if (redeemedOffers2 != null) {
                            String couponCode2 = redeemedOffers2.getCouponCode();
                            Intrinsics.checkNotNullParameter(couponCode2, "<this>");
                            boolean matches = Patterns.WEB_URL.matcher(couponCode2).matches();
                            View view3 = this$0.f22629a;
                            if (matches) {
                                String url = redeemedOffers2.getCouponCode();
                                Intrinsics.checkNotNullParameter(url, "url");
                                k.startActivity(view3.getContext(), new Intent("android.intent.action.VIEW", Uri.parse(url)), null);
                                return;
                            }
                            String url2 = redeemedOffers2.getVendor().getSiteURL();
                            Intrinsics.checkNotNullParameter(url2, "url");
                            k.startActivity(view3.getContext(), new Intent("android.intent.action.VIEW", Uri.parse(url2)), null);
                            return;
                        }
                        return;
                    default:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        RedeemedOffers redeemedOffers3 = (RedeemedOffers) ((RedeemedOfferItemViewModel) this$0.v()).f9075c.getValue();
                        if (redeemedOffers3 != null) {
                            String text = redeemedOffers3.getCouponCode();
                            f fVar = this$0.f33740x;
                            fVar.getClass();
                            Intrinsics.checkNotNullParameter(text, "text");
                            fVar.f33751a.f33752h.invoke(text);
                            return;
                        }
                        return;
                }
            }
        });
    }
}
