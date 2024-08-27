package fc;

import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.PopupWindow;
import androidx.core.widget.NestedScrollView;
import ba.jk;
import ba.jr;
import ba.ru;
import ba.vs;
import com.assetgro.stockgro.missions.presentation.detail.MissionTaskDetailFragment;
import com.assetgro.stockgro.ui.chat.detail.group.GroupChatFragment;
import com.assetgro.stockgro.widget.PriceInputView;
import com.assetgro.stockgro.widget.mentionable_edit_text.MentionableEditText;
import java.text.ParseException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.q;
import kotlin.text.w;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements View.OnFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16003a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f16004b;

    public /* synthetic */ a(Object obj, int i10) {
        this.f16003a = i10;
        this.f16004b = obj;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z10) {
        int i10 = this.f16003a;
        Object obj = this.f16004b;
        switch (i10) {
            case 0:
                MissionTaskDetailFragment this$0 = (MissionTaskDetailFragment) obj;
                int i11 = MissionTaskDetailFragment.f8859j;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (z10) {
                    NestedScrollView nestedScrollView = ((jk) this$0.q()).f5149s.f5932t.f5686w;
                    nestedScrollView.post(new androidx.activity.b(nestedScrollView, 24));
                    vs vsVar = ((jk) this$0.q()).f5149s.f5932t.f5683t;
                    vsVar.f6466t.setVisibility(8);
                    ImageView iconArrow = vsVar.f6465s;
                    Intrinsics.checkNotNullExpressionValue(iconArrow, "iconArrow");
                    kp.j.f0(iconArrow, true);
                    return;
                }
                return;
            case 1:
                PriceInputView this$02 = (PriceInputView) obj;
                int i12 = PriceInputView.f10675z;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                if (z10) {
                    String str = this$02.f10679v;
                    ru ruVar = this$02.f10677t;
                    if (str != null) {
                        EditText editText = ruVar.f6011v;
                        ij.h hVar = ij.h.f20067a;
                        editText.setText(String.valueOf(ij.h.a(str)));
                        return;
                    }
                    ruVar.f6011v.setText(HttpUrl.FRAGMENT_ENCODE_SET);
                    return;
                }
                String str2 = this$02.f10679v;
                double d10 = 0.0d;
                if (str2 != null && !w.C(str2)) {
                    if (TextUtils.isDigitsOnly(str2)) {
                        Double e10 = q.e(str2);
                        if (e10 != null) {
                            d10 = e10.doubleValue();
                        }
                    } else {
                        try {
                            Double e11 = q.e(str2);
                            if (e11 != null) {
                                d10 = e11.doubleValue();
                            }
                        } catch (ParseException unused) {
                        }
                    }
                }
                this$02.setPrice(Double.valueOf(d10));
                return;
            case 2:
                sj.b bVar = ((MentionableEditText) obj).f10761j;
                Boolean valueOf = Boolean.valueOf(z10);
                rd.e eVar = (rd.e) bVar;
                eVar.getClass();
                PopupWindow popupWindow = GroupChatFragment.f9146w;
                jr this_apply = eVar.f33618a;
                Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
                Intrinsics.c(valueOf);
                if (valueOf.booleanValue()) {
                    this_apply.D.setVisibility(8);
                    return;
                }
                return;
            case 3:
                zo.c cVar = (zo.c) obj;
                cVar.t(cVar.u());
                return;
            default:
                zo.i iVar = (zo.i) obj;
                iVar.f42605l = z10;
                iVar.q();
                if (!z10) {
                    iVar.t(false);
                    iVar.f42606m = false;
                    return;
                }
                return;
        }
    }
}
