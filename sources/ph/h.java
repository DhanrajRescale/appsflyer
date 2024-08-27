package ph;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import ba.um;
import com.assetgro.stockgro.prod.R;
import iu.k;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class h extends k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31103a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f31104b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(i iVar, int i10) {
        super(1);
        this.f31103a = i10;
        this.f31104b = iVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f31103a;
        i iVar = this.f31104b;
        switch (i10) {
            case 0:
                List list = (List) obj;
                if (list.isEmpty()) {
                    ((um) iVar.q()).f6329s.f5852s.setVisibility(0);
                } else {
                    ((um) iVar.q()).f6329s.f5852s.setVisibility(8);
                }
                g gVar = iVar.f31106g;
                if (gVar != null) {
                    gVar.u(list);
                    return Unit.f23355a;
                }
                Intrinsics.k("redemptionOffersAdapter");
                throw null;
            case 1:
                Boolean bool = (Boolean) obj;
                SwipeRefreshLayout swipeRefreshLayout = ((um) iVar.q()).f6329s.f5854u;
                Intrinsics.c(bool);
                swipeRefreshLayout.setRefreshing(bool.booleanValue());
                return Unit.f23355a;
            default:
                String text = (String) obj;
                Context context = iVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(context, "requireContext(...)");
                Intrinsics.c(text);
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(text, "text");
                if (text.length() != 0) {
                    Toast makeText = Toast.makeText(context, HttpUrl.FRAGMENT_ENCODE_SET, 1);
                    Object systemService = context.getSystemService("layout_inflater");
                    Intrinsics.d(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
                    View inflate = ((LayoutInflater) systemService).inflate(R.layout.background_custom_toast_message, (ViewGroup) null);
                    w.k.c(text, (TextView) inflate.findViewById(R.id.message), makeText, inflate);
                }
                return Unit.f23355a;
        }
    }
}
