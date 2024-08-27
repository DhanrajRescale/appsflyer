package ed;

import android.content.Context;
import android.widget.ImageView;
import ba.vb;
import com.assetgro.stockgro.prod.R;
import iu.k;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m4.m;

/* loaded from: classes.dex */
public final class b extends k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15373a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f15374b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(c cVar, int i10) {
        super(1);
        this.f15373a = i10;
        this.f15374b = cVar;
    }

    public final void a(String str) {
        int i10 = this.f15373a;
        c cVar = this.f15374b;
        switch (i10) {
            case 0:
                ((vb) cVar.f17291u).f6420u.setText(String.valueOf(str));
                return;
            default:
                if (str != null) {
                    switch (str.hashCode()) {
                        case 49:
                            if (str.equals("1")) {
                                ((vb) cVar.f17291u).f6422w.setVisibility(0);
                                vb vbVar = (vb) cVar.f17291u;
                                vbVar.f6418s.setVisibility(4);
                                ImageView imageView = vbVar.f6422w;
                                imageView.setImageDrawable(r3.k.getDrawable(imageView.getContext(), R.drawable.ic_prepzone_rank_1));
                                vbVar.f6419t.setBackgroundColor(r3.k.getColor(vbVar.f27491e.getContext(), R.color.gold_yellow_new));
                                return;
                            }
                            break;
                        case 50:
                            if (str.equals("2")) {
                                ((vb) cVar.f17291u).f6422w.setVisibility(0);
                                vb vbVar2 = (vb) cVar.f17291u;
                                vbVar2.f6418s.setVisibility(4);
                                ImageView imageView2 = vbVar2.f6422w;
                                imageView2.setImageDrawable(r3.k.getDrawable(imageView2.getContext(), R.drawable.ic_prepzone_rank_2));
                                vbVar2.f6419t.setBackgroundColor(r3.k.getColor(vbVar2.f27491e.getContext(), R.color.silver_new));
                                return;
                            }
                            break;
                        case 51:
                            if (str.equals("3")) {
                                ((vb) cVar.f17291u).f6422w.setVisibility(0);
                                vb vbVar3 = (vb) cVar.f17291u;
                                vbVar3.f6418s.setVisibility(4);
                                ImageView imageView3 = vbVar3.f6422w;
                                imageView3.setImageDrawable(r3.k.getDrawable(imageView3.getContext(), R.drawable.ic_prepzone_rank_3));
                                vbVar3.f6419t.setBackgroundColor(r3.k.getColor(vbVar3.f27491e.getContext(), R.color.bronze_new));
                                return;
                            }
                            break;
                    }
                }
                int d10 = cVar.d() % 2;
                m mVar = cVar.f17291u;
                if (d10 == 1) {
                    vb vbVar4 = (vb) mVar;
                    vbVar4.f6419t.setBackgroundColor(r3.k.getColor(vbVar4.f27491e.getContext(), R.color.blue_4A20E6_08_alternate));
                }
                vb vbVar5 = (vb) mVar;
                vbVar5.f6422w.setVisibility(4);
                vbVar5.f6418s.setVisibility(0);
                vbVar5.f6418s.setText(str);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f15373a) {
            case 0:
                a((String) obj);
                return Unit.f23355a;
            case 1:
                Integer num = (Integer) obj;
                c cVar = this.f15374b;
                ImageView imageView = ((vb) cVar.f17291u).f6421v;
                Context context = cVar.f22629a.getContext();
                Intrinsics.c(num);
                imageView.setImageDrawable(r3.k.getDrawable(context, num.intValue()));
                return Unit.f23355a;
            default:
                a((String) obj);
                return Unit.f23355a;
        }
    }
}
