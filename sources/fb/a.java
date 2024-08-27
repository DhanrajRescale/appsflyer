package fb;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.j0;
import ba.an;
import com.assetgro.stockgro.feature_onboarding.presentation.register.pin.SetPinFragment;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.main.MainActivity;
import com.kaopiz.kprogresshud.f;
import el.l;
import iu.k;
import java.util.Map;
import kj.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.w;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class a extends k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15990a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SetPinFragment f15991b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(SetPinFragment setPinFragment, int i10) {
        super(1);
        this.f15990a = i10;
        this.f15991b = setPinFragment;
    }

    public final void a(String text) {
        boolean z10 = true;
        int i10 = this.f15990a;
        SetPinFragment setPinFragment = this.f15991b;
        switch (i10) {
            case 0:
                Context context = setPinFragment.requireContext();
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
                    return;
                }
                return;
            default:
                Intrinsics.checkNotNullParameter(text, "it");
                boolean z11 = false;
                if (text != null) {
                    if (!(!w.C(text)) || text.length() != 4) {
                        z10 = false;
                    }
                    z11 = z10;
                }
                View next = ((an) setPinFragment.q()).f4211s.getNext();
                next.setEnabled(z11);
                next.setAlpha(l.s(z11));
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Bundle extras;
        int i10 = this.f15990a;
        SetPinFragment setPinFragment = this.f15991b;
        switch (i10) {
            case 0:
                a((String) obj);
                return Unit.f23355a;
            case 1:
                if (((Map) ((j) obj).a()) != null) {
                    Intent intent = new Intent(setPinFragment.getActivity(), (Class<?>) MainActivity.class);
                    setPinFragment.startActivity(intent);
                    j0 activity = setPinFragment.getActivity();
                    if (activity != null) {
                        activity.finish();
                    }
                    Intent intent2 = setPinFragment.requireActivity().getIntent();
                    if (intent2 != null && (extras = intent2.getExtras()) != null) {
                        intent.putExtras(extras);
                    }
                }
                return Unit.f23355a;
            case 2:
                Boolean bool = (Boolean) obj;
                Intrinsics.c(bool);
                if (bool.booleanValue()) {
                    f fVar = setPinFragment.f17283a;
                    if (fVar != null) {
                        fVar.d();
                    }
                } else {
                    f fVar2 = setPinFragment.f17283a;
                    if (fVar2 != null) {
                        fVar2.b();
                    }
                }
                return Unit.f23355a;
            case 3:
                a((String) obj);
                return Unit.f23355a;
            default:
                Intrinsics.checkNotNullParameter((View) obj, "<anonymous parameter 0>");
                ((an) setPinFragment.q()).f4212t.setText(((an) setPinFragment.q()).f4211s.getTextInput(), TextView.BufferType.EDITABLE);
                return Unit.f23355a;
        }
    }
}
