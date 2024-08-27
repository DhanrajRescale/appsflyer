package zc;

import android.content.Context;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import ba.n9;
import com.assetgro.stockgro.data.model.ChangeDto;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.widget.StockChangeInfoView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class j extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42391a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f42392b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(k kVar, int i10) {
        super(1);
        this.f42391a = i10;
        this.f42392b = kVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x000f. Please report as an issue. */
    public final void a(String str) {
        int i10 = this.f42391a;
        k kVar = this.f42392b;
        switch (i10) {
            case 0:
                ((n9) kVar.f17291u).f5535t.setText(str);
                return;
            case 1:
                nk.a p10 = ((nk.e) ((nk.e) new nk.a().f(ak.p.f555a)).q()).p(new qk.b(String.valueOf(System.currentTimeMillis())));
                Intrinsics.checkNotNullExpressionValue(p10, "signature(...)");
                ImageView imageView = ((n9) kVar.f17291u).f5537v;
                ((com.bumptech.glide.g) ((com.bumptech.glide.g) com.bumptech.glide.b.f(imageView).m(str).w((nk.e) p10).b()).l(R.drawable.ic_placeholder_user)).z(imageView);
                return;
            default:
                if (str != null) {
                    switch (str.hashCode()) {
                        case 49:
                            if (str.equals("1")) {
                                ImageView imageView2 = ((n9) kVar.f17291u).f5536u;
                                imageView2.setVisibility(0);
                                imageView2.setImageDrawable(r3.k.getDrawable(imageView2.getContext(), R.drawable.ic_first));
                                ((n9) kVar.f17291u).f5534s.setVisibility(4);
                                return;
                            }
                            break;
                        case 50:
                            if (str.equals("2")) {
                                ImageView imageView3 = ((n9) kVar.f17291u).f5536u;
                                imageView3.setVisibility(0);
                                imageView3.setImageDrawable(r3.k.getDrawable(imageView3.getContext(), R.drawable.ic_second));
                                ((n9) kVar.f17291u).f5534s.setVisibility(4);
                                return;
                            }
                            break;
                        case 51:
                            if (str.equals("3")) {
                                ImageView imageView4 = ((n9) kVar.f17291u).f5536u;
                                imageView4.setVisibility(0);
                                imageView4.setImageDrawable(r3.k.getDrawable(imageView4.getContext(), R.drawable.ic_third));
                                ((n9) kVar.f17291u).f5534s.setVisibility(4);
                                return;
                            }
                            break;
                    }
                }
                ((n9) kVar.f17291u).f5536u.setVisibility(4);
                TextView textView = ((n9) kVar.f17291u).f5534s;
                textView.setVisibility(0);
                Intrinsics.c(str);
                kj.f.o(textView, str);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f42391a;
        k kVar = this.f42392b;
        switch (i10) {
            case 0:
                a((String) obj);
                return Unit.f23355a;
            case 1:
                a((String) obj);
                return Unit.f23355a;
            case 2:
                ((StockChangeInfoView) kVar.f22629a.findViewById(R.id.info)).a((ChangeDto) obj);
                return Unit.f23355a;
            case 3:
                Integer num = (Integer) obj;
                RelativeLayout relativeLayout = (RelativeLayout) kVar.f22629a.findViewById(R.id.card_background);
                Context context = relativeLayout.getContext();
                Intrinsics.c(num);
                relativeLayout.setBackgroundColor(r3.k.getColor(context, num.intValue()));
                return Unit.f23355a;
            default:
                a((String) obj);
                return Unit.f23355a;
        }
    }
}
