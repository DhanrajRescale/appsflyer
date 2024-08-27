package ba;

import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.assetgro.stockgro.data.model.ChatMessage;

/* loaded from: classes.dex */
public abstract class xw extends m4.m {

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f6693x = 0;

    /* renamed from: s, reason: collision with root package name */
    public final ImageView f6694s;

    /* renamed from: t, reason: collision with root package name */
    public final bx f6695t;

    /* renamed from: u, reason: collision with root package name */
    public final vw f6696u;

    /* renamed from: v, reason: collision with root package name */
    public final ConstraintLayout f6697v;

    /* renamed from: w, reason: collision with root package name */
    public ChatMessage f6698w;

    public xw(Object obj, View view, ImageView imageView, bx bxVar, vw vwVar, ConstraintLayout constraintLayout) {
        super(obj, view, 2);
        this.f6694s = imageView;
        this.f6695t = bxVar;
        this.f6696u = vwVar;
        this.f6697v = constraintLayout;
    }
}
