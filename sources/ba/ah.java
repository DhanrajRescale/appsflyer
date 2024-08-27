package ba;

import android.view.View;
import com.assetgro.stockgro.widget.CustomKeyboard;
import com.chaos.view.PinView;

/* loaded from: classes.dex */
public abstract class ah extends m4.m {

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ int f4200u = 0;

    /* renamed from: s, reason: collision with root package name */
    public final CustomKeyboard f4201s;

    /* renamed from: t, reason: collision with root package name */
    public final PinView f4202t;

    public ah(Object obj, View view, CustomKeyboard customKeyboard, PinView pinView) {
        super(obj, view, 0);
        this.f4201s = customKeyboard;
        this.f4202t = pinView;
    }
}
