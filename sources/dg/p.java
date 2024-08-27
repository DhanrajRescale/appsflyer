package dg;

import android.view.LayoutInflater;
import android.widget.TextView;
import androidx.databinding.DataBinderMapperImpl;
import androidx.recyclerview.widget.RecyclerView;
import ba.sd;
import ba.td;
import com.assetgro.stockgro.data.model.WalletTransaction;
import com.assetgro.stockgro.prod.R;
import g7.f3;
import java.util.ArrayList;
import k7.y1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class p extends f3 {

    /* renamed from: j, reason: collision with root package name */
    public static final ga.a f14376j = new ga.a(8);

    /* renamed from: g, reason: collision with root package name */
    public final Function2 f14377g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f14378h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f14379i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(be.b onItemClick) {
        super(f14376j);
        Intrinsics.checkNotNullParameter(onItemClick, "onItemClick");
        this.f14377g = onItemClick;
        this.f14378h = new ArrayList();
        this.f14379i = new ArrayList();
    }

    @Override // k7.z0
    public final void h(y1 y1Var, int i10) {
        o holder = (o) y1Var;
        Intrinsics.checkNotNullParameter(holder, "holder");
        WalletTransaction walletTransaction = (WalletTransaction) q(i10);
        if (walletTransaction != null) {
            sd sdVar = holder.f14374u;
            p pVar = holder.f14375v;
            hv.e l10 = hv.e.l(0, walletTransaction.getTxnDate());
            hv.f fVar = a3.a.a(l10, l10).f18769a.f18726a;
            jv.a b10 = jv.a.b("MMMM yyyy");
            fVar.getClass();
            String a10 = b10.a(fVar);
            Intrinsics.checkNotNullExpressionValue(a10, "format(...)");
            if (!pVar.f14378h.contains(a10)) {
                pVar.f14378h.add(a10);
                pVar.f14379i.add(Integer.valueOf(holder.d()));
            }
            if (pVar.f14379i.contains(Integer.valueOf(holder.d()))) {
                TextView transactionMonthHeading = sdVar.f6064w;
                Intrinsics.checkNotNullExpressionValue(transactionMonthHeading, "transactionMonthHeading");
                zq.f.m0(transactionMonthHeading);
                sdVar.f6064w.setText((CharSequence) pVar.f14378h.get(pVar.f14379i.indexOf(Integer.valueOf(holder.d()))));
            } else {
                TextView transactionMonthHeading2 = sdVar.f6064w;
                Intrinsics.checkNotNullExpressionValue(transactionMonthHeading2, "transactionMonthHeading");
                zq.f.M(transactionMonthHeading2);
            }
            td tdVar = (td) sdVar;
            tdVar.A = walletTransaction;
            synchronized (tdVar) {
                tdVar.D |= 1;
            }
            tdVar.a(6);
            tdVar.m();
        }
    }

    @Override // k7.z0
    public final y1 i(int i10, RecyclerView parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        LayoutInflater from = LayoutInflater.from(parent.getContext());
        int i11 = sd.B;
        DataBinderMapperImpl dataBinderMapperImpl = m4.d.f27474a;
        sd sdVar = (sd) m4.m.g(from, R.layout.cell_wallet_transactions, parent, false, null);
        Intrinsics.checkNotNullExpressionValue(sdVar, "inflate(...)");
        return new o(this, sdVar);
    }
}
