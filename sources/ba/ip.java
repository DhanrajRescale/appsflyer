package ba;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.button.MaterialButton;

/* loaded from: classes.dex */
public abstract class ip extends m4.m {

    /* renamed from: s, reason: collision with root package name */
    public final MaterialButton f5068s;

    /* renamed from: t, reason: collision with root package name */
    public final ImageView f5069t;

    /* renamed from: u, reason: collision with root package name */
    public final TextView f5070u;

    /* renamed from: v, reason: collision with root package name */
    public final TextView f5071v;

    /* renamed from: w, reason: collision with root package name */
    public final Toolbar f5072w;

    public ip(Object obj, View view, MaterialButton materialButton, ImageView imageView, TextView textView, TextView textView2, Toolbar toolbar) {
        super(obj, view, 0);
        this.f5068s = materialButton;
        this.f5069t = imageView;
        this.f5070u = textView;
        this.f5071v = textView2;
        this.f5072w = toolbar;
    }
}
