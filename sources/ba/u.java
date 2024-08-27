package ba;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.Toolbar;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.assetgro.stockgro.widget.InputView;
import com.google.android.material.button.MaterialButton;

/* loaded from: classes.dex */
public abstract class u extends m4.m {
    public final SwipeRefreshLayout A;
    public final Toolbar B;
    public final ImageView C;
    public final InputView D;

    /* renamed from: s, reason: collision with root package name */
    public final InputView f6250s;

    /* renamed from: t, reason: collision with root package name */
    public final MaterialButton f6251t;

    /* renamed from: u, reason: collision with root package name */
    public final FrameLayout f6252u;

    /* renamed from: v, reason: collision with root package name */
    public final ImageView f6253v;

    /* renamed from: w, reason: collision with root package name */
    public final tu f6254w;

    /* renamed from: x, reason: collision with root package name */
    public final InputView f6255x;

    /* renamed from: y, reason: collision with root package name */
    public final InputView f6256y;

    /* renamed from: z, reason: collision with root package name */
    public final MaterialButton f6257z;

    public u(Object obj, View view, InputView inputView, MaterialButton materialButton, FrameLayout frameLayout, ImageView imageView, tu tuVar, InputView inputView2, InputView inputView3, MaterialButton materialButton2, SwipeRefreshLayout swipeRefreshLayout, Toolbar toolbar, ImageView imageView2, InputView inputView4) {
        super(obj, view, 1);
        this.f6250s = inputView;
        this.f6251t = materialButton;
        this.f6252u = frameLayout;
        this.f6253v = imageView;
        this.f6254w = tuVar;
        this.f6255x = inputView2;
        this.f6256y = inputView3;
        this.f6257z = materialButton2;
        this.A = swipeRefreshLayout;
        this.B = toolbar;
        this.C = imageView2;
        this.D = inputView4;
    }
}
