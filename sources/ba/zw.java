package ba;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.assetgro.stockgro.data.model.ChatMessage;

/* loaded from: classes.dex */
public abstract class zw extends m4.m {
    public static final /* synthetic */ int A = 0;

    /* renamed from: s, reason: collision with root package name */
    public final ImageView f6894s;

    /* renamed from: t, reason: collision with root package name */
    public final ImageView f6895t;

    /* renamed from: u, reason: collision with root package name */
    public final ConstraintLayout f6896u;

    /* renamed from: v, reason: collision with root package name */
    public final bx f6897v;

    /* renamed from: w, reason: collision with root package name */
    public final RelativeLayout f6898w;

    /* renamed from: x, reason: collision with root package name */
    public final ConstraintLayout f6899x;

    /* renamed from: y, reason: collision with root package name */
    public final vw f6900y;

    /* renamed from: z, reason: collision with root package name */
    public ChatMessage f6901z;

    public zw(Object obj, View view, ImageView imageView, ImageView imageView2, ConstraintLayout constraintLayout, bx bxVar, RelativeLayout relativeLayout, ConstraintLayout constraintLayout2, vw vwVar) {
        super(obj, view, 2);
        this.f6894s = imageView;
        this.f6895t = imageView2;
        this.f6896u = constraintLayout;
        this.f6897v = bxVar;
        this.f6898w = relativeLayout;
        this.f6899x = constraintLayout2;
        this.f6900y = vwVar;
    }
}
