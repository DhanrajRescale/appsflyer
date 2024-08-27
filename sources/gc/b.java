package gc;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import ba.hk;
import com.assetgro.stockgro.missions.presentation.history.MissionHistoryFragment;
import com.assetgro.stockgro.prod.R;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class b extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17220a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MissionHistoryFragment f17221b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(MissionHistoryFragment missionHistoryFragment, int i10) {
        super(1);
        this.f17220a = i10;
        this.f17221b = missionHistoryFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f17220a;
        MissionHistoryFragment missionHistoryFragment = this.f17221b;
        switch (i10) {
            case 0:
                Context context = missionHistoryFragment.requireContext();
                Intrinsics.checkNotNullExpressionValue(context, "requireContext(...)");
                Context requireContext = missionHistoryFragment.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                String text = ((z9.i) obj).a(requireContext);
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
            default:
                Pair pair = (Pair) obj;
                hk hkVar = (hk) missionHistoryFragment.q();
                hkVar.f4949y.setText((CharSequence) pair.f23353a);
                ImageView userImage = hkVar.f4948x;
                Intrinsics.checkNotNullExpressionValue(userImage, "userImage");
                zq.f.X(userImage, (String) pair.f23354b, R.drawable.ic_placeholder_user);
                return Unit.f23355a;
        }
    }
}
