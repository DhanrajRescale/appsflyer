package m;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.SearchView;
import com.assetgro.stockgro.prod.R;
import com.google.android.material.bottomappbar.BottomAppBar$Behavior;

/* loaded from: classes.dex */
public final class y2 implements View.OnLayoutChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25802a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f25803b;

    public /* synthetic */ y2(Object obj, int i10) {
        this.f25802a = i10;
        this.f25803b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        int i18;
        xn.a aVar;
        int i19 = 0;
        int i20 = this.f25802a;
        Object obj = this.f25803b;
        switch (i20) {
            case 0:
                SearchView searchView = (SearchView) obj;
                View view2 = searchView.f1064x;
                if (view2.getWidth() > 1) {
                    Resources resources = searchView.getContext().getResources();
                    int paddingLeft = searchView.f1052r.getPaddingLeft();
                    Rect rect = new Rect();
                    boolean a10 = d4.a(searchView);
                    if (searchView.f1041h0) {
                        i19 = resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width) + resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_text_padding_left);
                    }
                    SearchView.SearchAutoComplete searchAutoComplete = searchView.f1048p;
                    searchAutoComplete.getDropDownBackground().getPadding(rect);
                    if (a10) {
                        i18 = -rect.left;
                    } else {
                        i18 = paddingLeft - (rect.left + i19);
                    }
                    searchAutoComplete.setDropDownHorizontalOffset(i18);
                    searchAutoComplete.setDropDownWidth((((view2.getWidth() + rect.left) + rect.right) + i19) - paddingLeft);
                    return;
                }
                return;
            case 1:
                ((BottomAppBar$Behavior) obj).getClass();
                throw null;
            case 2:
                no.c cVar = (no.c) obj;
                if (cVar.f29016m.getVisibility() == 0 && (aVar = cVar.D) != null) {
                    Rect rect2 = new Rect();
                    ImageView imageView = cVar.f29016m;
                    imageView.getDrawingRect(rect2);
                    aVar.setBounds(rect2);
                    aVar.f(imageView, null);
                    return;
                }
                return;
            default:
                bp.a aVar2 = (bp.a) obj;
                int i21 = bp.a.f7234e0;
                aVar2.getClass();
                int[] iArr = new int[2];
                view.getLocationOnScreen(iArr);
                aVar2.I = iArr[0];
                view.getWindowVisibleDisplayFrame(aVar2.C);
                return;
        }
    }
}
