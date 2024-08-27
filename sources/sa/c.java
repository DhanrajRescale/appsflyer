package sa;

import android.os.Parcelable;
import ba.s7;
import com.assetgro.stockgro.data.model.AssetInsightData;
import com.assetgro.stockgro.data.model.InsightListType;
import com.assetgro.stockgro.prod.R;
import java.util.List;
import k7.i1;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34406a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f34407b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(d dVar, int i10) {
        super(1);
        this.f34406a = i10;
        this.f34407b = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Parcelable parcelable;
        int i10;
        oa.a aVar;
        int i11;
        int i12 = this.f34406a;
        d dVar = this.f34407b;
        switch (i12) {
            case 0:
                List list = (List) obj;
                if (list != null && !list.isEmpty()) {
                    ((s7) dVar.f17291u).f6049s.setVisibility(0);
                    s7 s7Var = (s7) dVar.f17291u;
                    i1 layoutManager = s7Var.f6050t.getLayoutManager();
                    if (layoutManager != null) {
                        parcelable = layoutManager.i0();
                    } else {
                        parcelable = null;
                    }
                    oa.a aVar2 = dVar.f34410z;
                    if (aVar2 != null) {
                        aVar2.u(list);
                        oa.a aVar3 = dVar.A;
                        if (aVar3 != null) {
                            aVar3.u(list);
                            i1 layoutManager2 = s7Var.f6050t.getLayoutManager();
                            if (layoutManager2 != null) {
                                layoutManager2.h0(parcelable);
                            }
                        } else {
                            Intrinsics.k("volumeShockerAdapter");
                            throw null;
                        }
                    } else {
                        Intrinsics.k("insightListAdapter");
                        throw null;
                    }
                } else {
                    ((s7) dVar.f17291u).f6049s.setVisibility(8);
                }
                return Unit.f23355a;
            case 1:
                InsightListType type = ((AssetInsightData) obj).getType();
                dVar.getClass();
                if (type == null) {
                    i10 = -1;
                } else {
                    i10 = b.f34405a[type.ordinal()];
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            if (i10 == 4) {
                                aVar = dVar.f34410z;
                                if (aVar != null) {
                                    i11 = R.string.top_losers;
                                } else {
                                    Intrinsics.k("insightListAdapter");
                                    throw null;
                                }
                            }
                            return Unit.f23355a;
                        }
                        aVar = dVar.f34410z;
                        if (aVar != null) {
                            i11 = R.string.top_gainers;
                        } else {
                            Intrinsics.k("insightListAdapter");
                            throw null;
                        }
                    } else {
                        aVar = dVar.A;
                        if (aVar != null) {
                            i11 = R.string.volume_shockers;
                        } else {
                            Intrinsics.k("volumeShockerAdapter");
                            throw null;
                        }
                    }
                } else {
                    aVar = dVar.f34410z;
                    if (aVar != null) {
                        i11 = R.string.top_trending;
                    } else {
                        Intrinsics.k("insightListAdapter");
                        throw null;
                    }
                }
                s7 s7Var2 = (s7) dVar.f17291u;
                s7Var2.f6052v.setText(dVar.f22629a.getContext().getString(i11));
                s7Var2.f6050t.setAdapter(aVar);
                return Unit.f23355a;
            case 2:
                String it = (String) obj;
                switch (i12) {
                    case 2:
                        Intrinsics.checkNotNullParameter(it, "it");
                        dVar.f34408x.invoke(it);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(it, "it");
                        dVar.f34408x.invoke(it);
                        break;
                }
                return Unit.f23355a;
            default:
                String it2 = (String) obj;
                switch (i12) {
                    case 2:
                        Intrinsics.checkNotNullParameter(it2, "it");
                        dVar.f34408x.invoke(it2);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(it2, "it");
                        dVar.f34408x.invoke(it2);
                        break;
                }
                return Unit.f23355a;
        }
    }
}
