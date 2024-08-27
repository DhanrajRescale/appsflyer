package ba;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.assetgro.stockgro.widget.ChipView;

/* loaded from: classes.dex */
public abstract class nu extends m4.m {

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f5611w = 0;

    /* renamed from: s, reason: collision with root package name */
    public final ChipView f5612s;

    /* renamed from: t, reason: collision with root package name */
    public final ImageView f5613t;

    /* renamed from: u, reason: collision with root package name */
    public final TextView f5614u;

    /* renamed from: v, reason: collision with root package name */
    public final ConstraintLayout f5615v;

    public nu(Object obj, View view, ChipView chipView, ImageView imageView, TextView textView, ConstraintLayout constraintLayout) {
        super(obj, view, 0);
        this.f5612s = chipView;
        this.f5613t = imageView;
        this.f5614u = textView;
        this.f5615v = constraintLayout;
    }
}
