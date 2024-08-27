package af;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.d1;
import androidx.lifecycle.o;
import ba.e4;
import com.assetgro.stockgro.data.model.StockGyanGroup;
import com.assetgro.stockgro.data.model.StockGyanIndex;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.drawer.stockgyan.StockGyanGroupsViewModel;
import com.assetgro.stockgro.ui.drawer.stockgyan.StockGyanIndexActivity;
import com.assetgro.stockgro.ui.home.stockgyan.gyan.StockGyanActivity;
import iu.k;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kj.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import vt.y;
import vt.z;
import yo.n;
import z7.e;

/* loaded from: classes.dex */
public final class d extends k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f401a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ StockGyanIndexActivity f402b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(StockGyanIndexActivity stockGyanIndexActivity, int i10) {
        super(1);
        this.f401a = i10;
        this.f402b = stockGyanIndexActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v3, types: [k7.z0, cf.a, z7.e] */
    public final void a(List list) {
        List list2;
        int i10 = this.f401a;
        StockGyanIndexActivity stockGyanIndexActivity = this.f402b;
        switch (i10) {
            case 1:
                kf.a aVar = stockGyanIndexActivity.f9510k;
                if (aVar != null) {
                    aVar.u(list);
                    return;
                } else {
                    Intrinsics.k("stockGyanIndexAdapter");
                    throw null;
                }
            default:
                ((StockGyanGroupsViewModel) stockGyanIndexActivity.x()).f9508u.clear();
                ArrayList arrayList = ((StockGyanGroupsViewModel) stockGyanIndexActivity.x()).f9508u;
                Intrinsics.c(list);
                ArrayList arrayList2 = new ArrayList(z.k(list));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((StockGyanGroup) it.next()).getName());
                }
                arrayList.addAll(arrayList2);
                d1 fragmentManager = stockGyanIndexActivity.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(fragmentManager, "getSupportFragmentManager(...)");
                o lifecycle = stockGyanIndexActivity.getLifecycle();
                Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
                Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
                Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
                ?? eVar = new e(fragmentManager, lifecycle);
                eVar.f8129m = 1;
                eVar.f8129m = ((StockGyanGroupsViewModel) stockGyanIndexActivity.x()).f9508u.size();
                ((e4) stockGyanIndexActivity.w()).f4567s.setAdapter(eVar);
                new n(((e4) stockGyanIndexActivity.w()).f4569u, ((e4) stockGyanIndexActivity.w()).f4567s, new c(stockGyanIndexActivity)).a();
                new WeakReference(((e4) stockGyanIndexActivity.w()).f4569u);
                ((e4) stockGyanIndexActivity.w()).f4569u.a(new nc.c(stockGyanIndexActivity, 5));
                new WeakReference(((e4) stockGyanIndexActivity.w()).f4569u);
                int i11 = 0;
                if (((e4) stockGyanIndexActivity.w()).f4569u.getTabCount() <= 2) {
                    ((e4) stockGyanIndexActivity.w()).f4569u.setTabMode(1);
                } else {
                    ((e4) stockGyanIndexActivity.w()).f4569u.setTabMode(0);
                }
                StockGyanGroup stockGyanGroup = (StockGyanGroup) ((StockGyanGroupsViewModel) stockGyanIndexActivity.x()).f9506s.getValue();
                if (stockGyanGroup != null && (list2 = (List) ((StockGyanGroupsViewModel) stockGyanIndexActivity.x()).f9503p.getValue()) != null) {
                    for (Object obj : list2) {
                        int i12 = i11 + 1;
                        if (i11 >= 0) {
                            if (((StockGyanGroup) obj).getId().equals(stockGyanGroup.getId())) {
                                ((e4) stockGyanIndexActivity.w()).f4569u.m(((e4) stockGyanIndexActivity.w()).f4569u.i(i11), true);
                            }
                            i11 = i12;
                        } else {
                            y.j();
                            throw null;
                        }
                    }
                    return;
                }
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f401a;
        StockGyanIndexActivity context = this.f402b;
        switch (i10) {
            case 0:
                Boolean bool = (Boolean) obj;
                e4 e4Var = (e4) context.w();
                Intrinsics.c(bool);
                e4Var.f4570v.setRefreshing(bool.booleanValue());
                return Unit.f23355a;
            case 1:
                a((List) obj);
                return Unit.f23355a;
            case 2:
                a((List) obj);
                return Unit.f23355a;
            case 3:
                Boolean bool2 = (Boolean) ((j) obj).a();
                if (bool2 != null && bool2.booleanValue()) {
                    int i11 = StockGyanIndexActivity.f9509l;
                    context.K();
                }
                return Unit.f23355a;
            default:
                StockGyanIndex it = (StockGyanIndex) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                if (it.getStockGyanCards().size() > 0) {
                    Intent intent = new Intent(context, (Class<?>) StockGyanActivity.class);
                    intent.putExtra("DATA", it);
                    intent.putExtra("CARD_INTERACTION", ((StockGyanGroupsViewModel) context.x()).f9505r);
                    context.startActivity(intent);
                } else {
                    Intrinsics.checkNotNullParameter(context, "context");
                    Intrinsics.checkNotNullParameter("No index cards", "text");
                    Toast makeText = Toast.makeText(context, HttpUrl.FRAGMENT_ENCODE_SET, 1);
                    Object systemService = context.getSystemService("layout_inflater");
                    Intrinsics.d(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
                    View inflate = ((LayoutInflater) systemService).inflate(R.layout.background_custom_toast_message, (ViewGroup) null);
                    w.k.c("No index cards", (TextView) inflate.findViewById(R.id.message), makeText, inflate);
                }
                return Unit.f23355a;
        }
    }
}
