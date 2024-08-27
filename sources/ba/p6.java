package ba;

import android.view.View;
import android.widget.TextView;
import com.google.android.material.button.MaterialButton;

/* loaded from: classes.dex */
public abstract class p6 extends m4.m {

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ int f5723u = 0;

    /* renamed from: s, reason: collision with root package name */
    public final MaterialButton f5724s;

    /* renamed from: t, reason: collision with root package name */
    public final TextView f5725t;

    public p6(View view, TextView textView, MaterialButton materialButton, Object obj) {
        super(obj, view, 0);
        this.f5724s = materialButton;
        this.f5725t = textView;
    }
}
