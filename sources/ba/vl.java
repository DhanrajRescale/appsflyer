package ba;

import android.view.View;
import android.widget.TextView;
import com.assetgro.stockgro.widget.CustomKeyboard;
import com.chaos.view.PinView;

/* loaded from: classes.dex */
public abstract class vl extends m4.m {

    /* renamed from: s, reason: collision with root package name */
    public final TextView f6448s;

    /* renamed from: t, reason: collision with root package name */
    public final CustomKeyboard f6449t;

    /* renamed from: u, reason: collision with root package name */
    public final PinView f6450u;

    public vl(Object obj, View view, TextView textView, CustomKeyboard customKeyboard, PinView pinView) {
        super(obj, view, 0);
        this.f6448s = textView;
        this.f6449t = customKeyboard;
        this.f6450u = pinView;
    }
}
