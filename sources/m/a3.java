package m;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;
import com.firebase.ui.auth.ui.phone.CountryListSpinner;

/* loaded from: classes.dex */
public final class a3 implements AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25478a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f25479b;

    public /* synthetic */ a3(View view, int i10) {
        this.f25478a = i10;
        this.f25479b = view;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
        Object item;
        int selectedItemPosition;
        int i11 = this.f25478a;
        View view2 = this.f25479b;
        switch (i11) {
            case 0:
                ((SearchView) view2).p(i10);
                return;
            case 1:
                CountryListSpinner countryListSpinner = (CountryListSpinner) view2;
                am.a aVar = (am.a) countryListSpinner.f10945i.getItem(i10);
                if (aVar != null) {
                    countryListSpinner.setText(am.a.a(aVar.f739b) + " +" + aVar.f740c);
                }
                countryListSpinner.f10948l.dismiss();
                return;
            default:
                View view3 = null;
                zo.r rVar = (zo.r) view2;
                if (i10 < 0) {
                    i2 i2Var = rVar.f42676e;
                    if (!i2Var.f25583z.isShowing()) {
                        item = null;
                    } else {
                        item = i2Var.f25560c.getSelectedItem();
                    }
                } else {
                    item = rVar.getAdapter().getItem(i10);
                }
                zo.r rVar2 = (zo.r) view2;
                zo.r.a(rVar2, item);
                AdapterView.OnItemClickListener onItemClickListener = rVar2.getOnItemClickListener();
                i2 i2Var2 = rVar2.f42676e;
                if (onItemClickListener != null) {
                    if (view == null || i10 < 0) {
                        if (i2Var2.f25583z.isShowing()) {
                            view3 = i2Var2.f25560c.getSelectedView();
                        }
                        view = view3;
                        if (!i2Var2.f25583z.isShowing()) {
                            selectedItemPosition = -1;
                        } else {
                            selectedItemPosition = i2Var2.f25560c.getSelectedItemPosition();
                        }
                        i10 = selectedItemPosition;
                        if (!i2Var2.f25583z.isShowing()) {
                            j10 = Long.MIN_VALUE;
                        } else {
                            j10 = i2Var2.f25560c.getSelectedItemId();
                        }
                    }
                    onItemClickListener.onItemClick(i2Var2.f25560c, view, i10, j10);
                }
                i2Var2.dismiss();
                return;
        }
    }
}
