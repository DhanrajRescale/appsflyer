package ge;

import android.graphics.drawable.Drawable;
import android.view.View;
import ba.d9;
import com.assetgro.stockgro.data.model.NonStockgroContact;
import com.assetgro.stockgro.prod.R;
import com.google.android.material.button.MaterialButton;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class h extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17315a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f17316b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(i iVar, int i10) {
        super(1);
        this.f17315a = i10;
        this.f17316b = iVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f17315a;
        i iVar = this.f17316b;
        switch (i10) {
            case 0:
                ((d9) iVar.f17291u).f4463u.setText((String) obj);
                return Unit.f23355a;
            default:
                NonStockgroContact nonStockgroContact = (NonStockgroContact) obj;
                String uuid = nonStockgroContact.getUuid();
                if (uuid != null && uuid.length() != 0) {
                    ((d9) iVar.f17291u).f4462t.setText(nonStockgroContact.getDisplayName());
                    d9 d9Var = (d9) iVar.f17291u;
                    MaterialButton materialButton = d9Var.f4461s;
                    View view = iVar.f22629a;
                    materialButton.setText(view.getResources().getString(R.string.text_chat));
                    d9Var.f4464v.setImageResource(R.drawable.ic_baseline_account_circle_24);
                    Drawable drawable = r3.k.getDrawable(view.getContext(), R.drawable.chat_button_background);
                    MaterialButton materialButton2 = d9Var.f4461s;
                    materialButton2.setBackground(drawable);
                    materialButton2.setTextColor(r3.k.getColor(view.getContext(), R.color.white));
                } else {
                    ((d9) iVar.f17291u).f4462t.setText(nonStockgroContact.getName());
                    d9 d9Var2 = (d9) iVar.f17291u;
                    MaterialButton materialButton3 = d9Var2.f4461s;
                    View view2 = iVar.f22629a;
                    materialButton3.setText(view2.getResources().getString(R.string.text_invite));
                    Drawable drawable2 = r3.k.getDrawable(view2.getContext(), R.drawable.invite_button_background);
                    MaterialButton materialButton4 = d9Var2.f4461s;
                    materialButton4.setBackground(drawable2);
                    materialButton4.setTextColor(r3.k.getColor(view2.getContext(), R.color.colorAccent));
                    d9Var2.f4464v.setImageResource(R.drawable.ic_baseline_account_circle_24);
                }
                return Unit.f23355a;
        }
    }
}
