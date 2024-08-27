package ba;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.assetgro.stockgro.data.model.ChatMessage;
import com.google.android.material.card.MaterialCardView;

/* loaded from: classes.dex */
public abstract class fx extends m4.m {
    public static final /* synthetic */ int G = 0;
    public final vx A;
    public final MaterialCardView B;
    public final ConstraintLayout C;
    public final TextView D;
    public ChatMessage E;
    public ChatMessage F;

    /* renamed from: s, reason: collision with root package name */
    public final TextView f4756s;

    /* renamed from: t, reason: collision with root package name */
    public final ImageView f4757t;

    /* renamed from: u, reason: collision with root package name */
    public final pw f4758u;

    /* renamed from: v, reason: collision with root package name */
    public final ImageView f4759v;

    /* renamed from: w, reason: collision with root package name */
    public final ConstraintLayout f4760w;

    /* renamed from: x, reason: collision with root package name */
    public final bx f4761x;

    /* renamed from: y, reason: collision with root package name */
    public final RelativeLayout f4762y;

    /* renamed from: z, reason: collision with root package name */
    public final c8 f4763z;

    public fx(Object obj, View view, TextView textView, ImageView imageView, pw pwVar, ImageView imageView2, ConstraintLayout constraintLayout, bx bxVar, RelativeLayout relativeLayout, c8 c8Var, vx vxVar, MaterialCardView materialCardView, ConstraintLayout constraintLayout2, TextView textView2) {
        super(obj, view, 4);
        this.f4756s = textView;
        this.f4757t = imageView;
        this.f4758u = pwVar;
        this.f4759v = imageView2;
        this.f4760w = constraintLayout;
        this.f4761x = bxVar;
        this.f4762y = relativeLayout;
        this.f4763z = c8Var;
        this.A = vxVar;
        this.B = materialCardView;
        this.C = constraintLayout2;
        this.D = textView2;
    }
}
