package rg;

import android.content.res.Resources;
import android.widget.ImageView;
import android.widget.TextView;
import ba.z6;
import com.assetgro.stockgro.prod.R;
import iu.k;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m4.m;

/* loaded from: classes.dex */
public final class c extends k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33732a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f33733b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(d dVar, int i10) {
        super(1);
        this.f33732a = i10;
        this.f33733b = dVar;
    }

    public final void a(String str) {
        int i10 = this.f33732a;
        d dVar = this.f33733b;
        switch (i10) {
            case 1:
                ((z6) dVar.f17291u).f6815x.setText(str);
                return;
            case 2:
                ((z6) dVar.f17291u).C.setText(str);
                return;
            case 3:
                ((z6) dVar.f17291u).D.setText(str);
                return;
            case 4:
                ((z6) dVar.f17291u).f6816y.setText(str);
                return;
            case 5:
                ((z6) dVar.f17291u).f6810s.setText(str);
                return;
            case 6:
                ((z6) dVar.f17291u).f6811t.setText(str);
                return;
            case 7:
                ((com.bumptech.glide.g) ((com.bumptech.glide.g) com.bumptech.glide.b.e(dVar.f22629a.getContext()).m(str).e()).i()).z(((z6) dVar.f17291u).B);
                return;
            case 8:
                ((z6) dVar.f17291u).f6817z.setText(str);
                return;
            default:
                ((z6) dVar.f17291u).f6812u.setText(str);
                boolean a10 = Intrinsics.a(str, "0.00 %");
                m mVar = dVar.f17291u;
                if (!a10 && !Intrinsics.a(str, "-0.00 %")) {
                    ((z6) mVar).f6813v.setVisibility(0);
                    return;
                } else {
                    ((z6) mVar).f6813v.setVisibility(8);
                    return;
                }
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10;
        switch (this.f33732a) {
            case 0:
                Boolean bool = (Boolean) obj;
                d dVar = this.f33733b;
                TextView textView = ((z6) dVar.f17291u).A;
                Resources resources = textView.getResources();
                if (Intrinsics.a(bool, Boolean.TRUE)) {
                    i10 = R.string.profit;
                } else if (Intrinsics.a(bool, Boolean.FALSE)) {
                    i10 = R.string.text_loss;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                textView.setText(resources.getString(i10));
                Intrinsics.c(bool);
                boolean booleanValue = bool.booleanValue();
                m mVar = dVar.f17291u;
                if (booleanValue) {
                    ImageView imageView = ((z6) mVar).f6813v;
                    imageView.setImageDrawable(r3.k.getDrawable(imageView.getContext(), R.drawable.ic_stock_up_arrow));
                } else {
                    ImageView imageView2 = ((z6) mVar).f6813v;
                    imageView2.setImageDrawable(r3.k.getDrawable(imageView2.getContext(), R.drawable.ic_stock_down_arrow));
                }
                return Unit.f23355a;
            case 1:
                a((String) obj);
                return Unit.f23355a;
            case 2:
                a((String) obj);
                return Unit.f23355a;
            case 3:
                a((String) obj);
                return Unit.f23355a;
            case 4:
                a((String) obj);
                return Unit.f23355a;
            case 5:
                a((String) obj);
                return Unit.f23355a;
            case 6:
                a((String) obj);
                return Unit.f23355a;
            case 7:
                a((String) obj);
                return Unit.f23355a;
            case 8:
                a((String) obj);
                return Unit.f23355a;
            default:
                a((String) obj);
                return Unit.f23355a;
        }
    }
}
