package o4;

import android.view.View;
import android.view.WindowInsets;
import androidx.drawerlayout.widget.DrawerLayout;

/* loaded from: classes.dex */
public final class a implements View.OnApplyWindowInsetsListener {
    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        boolean z10;
        DrawerLayout drawerLayout = (DrawerLayout) view;
        boolean z11 = false;
        if (windowInsets.getSystemWindowInsetTop() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        drawerLayout.f1570x = windowInsets;
        drawerLayout.f1571y = z10;
        if (!z10 && drawerLayout.getBackground() == null) {
            z11 = true;
        }
        drawerLayout.setWillNotDraw(z11);
        drawerLayout.requestLayout();
        return windowInsets.consumeSystemWindowInsets();
    }
}
