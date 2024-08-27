package xg;

import android.content.res.Resources;
import android.widget.TextView;
import ba.jb;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.widget.ChipView;
import com.bumptech.glide.g;
import iu.k;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m4.m;
import qj.j;

/* loaded from: classes.dex */
public final class d extends k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40257a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f40258b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(e eVar, int i10) {
        super(1);
        this.f40257a = i10;
        this.f40258b = eVar;
    }

    public final void a(Boolean bool) {
        int i10;
        int i11 = this.f40257a;
        e eVar = this.f40258b;
        switch (i11) {
            case 7:
                TextView textView = ((jb) eVar.f17291u).f5134w;
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
                m mVar = eVar.f17291u;
                if (booleanValue) {
                    jb jbVar = (jb) mVar;
                    jbVar.f5131t.setImageDrawable(r3.k.getDrawable(jbVar.f27491e.getContext(), R.drawable.ic_stock_up_arrow));
                    return;
                } else {
                    jb jbVar2 = (jb) mVar;
                    jbVar2.f5131t.setImageDrawable(r3.k.getDrawable(jbVar2.f27491e.getContext(), R.drawable.ic_stock_down_arrow));
                    return;
                }
            default:
                if (Intrinsics.a(bool, Boolean.TRUE)) {
                    ChipView chipView = ((jb) eVar.f17291u).B;
                    chipView.setVisibility(0);
                    chipView.setChipText(R.string.short_sell);
                    chipView.setChipType(j.f32017a);
                    return;
                }
                if (Intrinsics.a(bool, Boolean.FALSE)) {
                    ((jb) eVar.f17291u).B.setVisibility(8);
                    return;
                }
                return;
        }
    }

    public final void d(String str) {
        int i10 = this.f40257a;
        e eVar = this.f40258b;
        switch (i10) {
            case 0:
                ((jb) eVar.f17291u).f5137z.setText(str);
                return;
            case 1:
                ((jb) eVar.f17291u).A.setText(str);
                return;
            case 2:
                ((jb) eVar.f17291u).f5132u.setText(str);
                return;
            case 3:
                ((jb) eVar.f17291u).f5135x.setText(str);
                return;
            case 4:
                ((jb) eVar.f17291u).f5133v.setText(str);
                return;
            case 5:
                ((jb) eVar.f17291u).f5130s.setText(str);
                boolean a10 = Intrinsics.a(str, "0.0 %");
                m mVar = eVar.f17291u;
                if (!a10 && !Intrinsics.a(str, "-0.0 %")) {
                    ((jb) mVar).f5131t.setVisibility(0);
                    return;
                } else {
                    ((jb) mVar).f5131t.setVisibility(8);
                    return;
                }
            default:
                ((g) ((g) com.bumptech.glide.b.e(eVar.f22629a.getContext()).m(str).e()).i()).z(((jb) eVar.f17291u).f5136y);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f40257a) {
            case 0:
                d((String) obj);
                return Unit.f23355a;
            case 1:
                d((String) obj);
                return Unit.f23355a;
            case 2:
                d((String) obj);
                return Unit.f23355a;
            case 3:
                d((String) obj);
                return Unit.f23355a;
            case 4:
                d((String) obj);
                return Unit.f23355a;
            case 5:
                d((String) obj);
                return Unit.f23355a;
            case 6:
                d((String) obj);
                return Unit.f23355a;
            case 7:
                a((Boolean) obj);
                return Unit.f23355a;
            default:
                a((Boolean) obj);
                return Unit.f23355a;
        }
    }
}
