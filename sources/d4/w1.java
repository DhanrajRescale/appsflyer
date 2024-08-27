package d4;

import android.view.ViewParent;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class w1 extends iu.h implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public static final w1 f13860i = new w1();

    public w1() {
        super(1, ViewParent.class, "getParent", "getParent()Landroid/view/ViewParent;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((ViewParent) obj).getParent();
    }
}
