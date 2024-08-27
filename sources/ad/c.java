package ad;

import ak.p;
import android.widget.ImageView;
import android.widget.TextView;
import ba.l9;
import com.assetgro.stockgro.prod.R;
import iu.k;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c extends k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f355a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f356b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(d dVar, int i10) {
        super(1);
        this.f355a = i10;
        this.f356b = dVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x000f. Please report as an issue. */
    public final void a(String str) {
        int i10 = this.f355a;
        d dVar = this.f356b;
        switch (i10) {
            case 0:
                ((l9) dVar.f17291u).f5329t.setText(str);
                return;
            case 1:
                nk.a p10 = ((nk.e) ((nk.e) new nk.a().f(p.f555a)).q()).p(new qk.b(String.valueOf(System.currentTimeMillis())));
                Intrinsics.checkNotNullExpressionValue(p10, "signature(...)");
                ImageView imageView = ((l9) dVar.f17291u).f5333x;
                ((com.bumptech.glide.g) ((com.bumptech.glide.g) com.bumptech.glide.b.f(imageView).m(str).w((nk.e) p10).b()).l(R.drawable.ic_placeholder_user)).z(imageView);
                return;
            case 2:
                ImageView imageView2 = ((l9) dVar.f17291u).f5332w;
                Intrinsics.c(imageView2);
                al.d.c1(imageView2, Boolean.valueOf(dVar.f358x));
                ((l9) dVar.f17291u).f5330u.setText(str);
                return;
            default:
                if (str != null) {
                    switch (str.hashCode()) {
                        case 49:
                            if (str.equals("1")) {
                                ImageView imageView3 = ((l9) dVar.f17291u).f5331v;
                                imageView3.setVisibility(0);
                                imageView3.setImageDrawable(r3.k.getDrawable(imageView3.getContext(), R.drawable.ic_prepzone_rank_1));
                                ((l9) dVar.f17291u).f5328s.setVisibility(4);
                                return;
                            }
                            break;
                        case 50:
                            if (str.equals("2")) {
                                ImageView imageView4 = ((l9) dVar.f17291u).f5331v;
                                imageView4.setVisibility(0);
                                imageView4.setImageDrawable(r3.k.getDrawable(imageView4.getContext(), R.drawable.ic_prepzone_rank_2));
                                ((l9) dVar.f17291u).f5328s.setVisibility(4);
                                return;
                            }
                            break;
                        case 51:
                            if (str.equals("3")) {
                                ImageView imageView5 = ((l9) dVar.f17291u).f5331v;
                                imageView5.setVisibility(0);
                                imageView5.setImageDrawable(r3.k.getDrawable(imageView5.getContext(), R.drawable.ic_prepzone_rank_3));
                                ((l9) dVar.f17291u).f5328s.setVisibility(4);
                                return;
                            }
                            break;
                    }
                }
                ((l9) dVar.f17291u).f5331v.setVisibility(4);
                TextView textView = ((l9) dVar.f17291u).f5328s;
                textView.setVisibility(0);
                Intrinsics.c(str);
                kj.f.o(textView, str);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f355a) {
            case 0:
                a((String) obj);
                return Unit.f23355a;
            case 1:
                a((String) obj);
                return Unit.f23355a;
            case 2:
                a((String) obj);
                return Unit.f23355a;
            default:
                a((String) obj);
                return Unit.f23355a;
        }
    }
}
