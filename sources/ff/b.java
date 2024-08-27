package ff;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import ba.s0;
import com.assetgro.stockgro.data.model.KycSupportTicketResponseDto;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.helpcenter.StockGroHelpCenterActivity;
import com.kaopiz.kprogresshud.f;
import iu.k;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class b extends k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16054a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ StockGroHelpCenterActivity f16055b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(StockGroHelpCenterActivity stockGroHelpCenterActivity, int i10) {
        super(1);
        this.f16054a = i10;
        this.f16055b = stockGroHelpCenterActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f16054a;
        StockGroHelpCenterActivity context = this.f16055b;
        switch (i10) {
            case 0:
                Boolean bool = (Boolean) obj;
                Intrinsics.c(bool);
                if (bool.booleanValue()) {
                    f fVar = context.f17255c;
                    if (fVar != null) {
                        fVar.d();
                    }
                } else {
                    f fVar2 = context.f17255c;
                    if (fVar2 != null) {
                        fVar2.b();
                    }
                }
                return Unit.f23355a;
            case 1:
                Integer num = (Integer) obj;
                if (num != null && num.intValue() == 0) {
                    int i11 = StockGroHelpCenterActivity.f9532l;
                    context.L();
                } else if (num != null && num.intValue() == 5) {
                    StockGroHelpCenterActivity.K(context);
                    ((s0) context.w()).f6030x.f6687u.setVisibility(8);
                    ((s0) context.w()).f6030x.f6686t.setVisibility(0);
                    ((s0) context.w()).f6030x.f6685s.setVisibility(8);
                } else {
                    Intrinsics.c(num);
                    int intValue = num.intValue();
                    if (1 <= intValue && intValue < 5) {
                        StockGroHelpCenterActivity.K(context);
                    }
                }
                return Unit.f23355a;
            default:
                KycSupportTicketResponseDto kycSupportTicketResponseDto = (KycSupportTicketResponseDto) obj;
                if (kycSupportTicketResponseDto.getSuccess()) {
                    Intent intent = new Intent();
                    intent.putExtra("DATA", kycSupportTicketResponseDto);
                    context.setResult(-1, intent);
                    context.finish();
                } else {
                    String text = context.getString(R.string.text_error_query_submission);
                    Intrinsics.checkNotNullExpressionValue(text, "getString(...)");
                    Intrinsics.checkNotNullParameter(context, "context");
                    Intrinsics.checkNotNullParameter(text, "text");
                    if (text.length() != 0) {
                        Toast makeText = Toast.makeText(context, HttpUrl.FRAGMENT_ENCODE_SET, 1);
                        Object systemService = context.getSystemService("layout_inflater");
                        Intrinsics.d(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
                        View inflate = ((LayoutInflater) systemService).inflate(R.layout.background_custom_toast_message, (ViewGroup) null);
                        w.k.c(text, (TextView) inflate.findViewById(R.id.message), makeText, inflate);
                    }
                }
                return Unit.f23355a;
        }
    }
}
