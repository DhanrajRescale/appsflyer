package androidx.navigation;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Landroidx/navigation/d;", "Landroidx/navigation/v0;", "Landroidx/navigation/b;", "ni/j", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0})
@u0("activity")
/* loaded from: classes.dex */
public class d extends v0 {

    /* renamed from: c, reason: collision with root package name */
    public final Context f2183c;

    /* renamed from: d, reason: collision with root package name */
    public final Activity f2184d;

    public d(Context context) {
        Object obj;
        Intrinsics.checkNotNullParameter(context, "context");
        this.f2183c = context;
        Iterator it = pu.m.d(c.f2160b, context).iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((Context) obj) instanceof Activity) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        this.f2184d = (Activity) obj;
    }

    @Override // androidx.navigation.v0
    public final c0 a() {
        Intrinsics.checkNotNullParameter(this, "activityNavigator");
        return new c0(this);
    }

    @Override // androidx.navigation.v0
    public final c0 c(c0 c0Var, Bundle bundle, k0 k0Var) {
        Intent intent;
        int intExtra;
        b destination = (b) c0Var;
        Intrinsics.checkNotNullParameter(destination, "destination");
        if (destination.f2152k != null) {
            Intent intent2 = new Intent(destination.f2152k);
            if (bundle != null) {
                intent2.putExtras(bundle);
                String str = destination.f2153l;
                if (str != null && str.length() != 0) {
                    StringBuffer stringBuffer = new StringBuffer();
                    Matcher matcher = Pattern.compile("\\{(.+?)\\}").matcher(str);
                    while (matcher.find()) {
                        String group = matcher.group(1);
                        if (bundle.containsKey(group)) {
                            matcher.appendReplacement(stringBuffer, HttpUrl.FRAGMENT_ENCODE_SET);
                            stringBuffer.append(Uri.encode(String.valueOf(bundle.get(group))));
                        } else {
                            throw new IllegalArgumentException("Could not find " + group + " in " + bundle + " to fill data pattern " + str);
                        }
                    }
                    matcher.appendTail(stringBuffer);
                    intent2.setData(Uri.parse(stringBuffer.toString()));
                }
            }
            Activity activity = this.f2184d;
            if (activity == null) {
                intent2.addFlags(268435456);
            }
            if (k0Var != null && k0Var.f2234a) {
                intent2.addFlags(536870912);
            }
            int i10 = 0;
            if (activity != null && (intent = activity.getIntent()) != null && (intExtra = intent.getIntExtra("android-support-navigation:ActivityNavigator:current", 0)) != 0) {
                intent2.putExtra("android-support-navigation:ActivityNavigator:source", intExtra);
            }
            intent2.putExtra("android-support-navigation:ActivityNavigator:current", destination.f2181h);
            Context context = this.f2183c;
            Resources resources = context.getResources();
            if (k0Var != null) {
                int i11 = k0Var.f2241h;
                int i12 = k0Var.f2242i;
                if ((i11 > 0 && Intrinsics.a(resources.getResourceTypeName(i11), "animator")) || (i12 > 0 && Intrinsics.a(resources.getResourceTypeName(i12), "animator"))) {
                    Log.w("ActivityNavigator", "Activity destinations do not support Animator resource. Ignoring popEnter resource " + resources.getResourceName(i11) + " and popExit resource " + resources.getResourceName(i12) + " when launching " + destination);
                } else {
                    intent2.putExtra("android-support-navigation:ActivityNavigator:popEnterAnim", i11);
                    intent2.putExtra("android-support-navigation:ActivityNavigator:popExitAnim", i12);
                }
            }
            context.startActivity(intent2);
            if (k0Var != null && activity != null) {
                int i13 = k0Var.f2239f;
                int i14 = k0Var.f2240g;
                if ((i13 > 0 && Intrinsics.a(resources.getResourceTypeName(i13), "animator")) || (i14 > 0 && Intrinsics.a(resources.getResourceTypeName(i14), "animator"))) {
                    Log.w("ActivityNavigator", "Activity destinations do not support Animator resource. Ignoring enter resource " + resources.getResourceName(i13) + " and exit resource " + resources.getResourceName(i14) + "when launching " + destination);
                    return null;
                }
                if (i13 >= 0 || i14 >= 0) {
                    if (i13 < 0) {
                        i13 = 0;
                    }
                    if (i14 >= 0) {
                        i10 = i14;
                    }
                    activity.overridePendingTransition(i13, i10);
                    return null;
                }
                return null;
            }
            return null;
        }
        throw new IllegalStateException(nn.d.m(new StringBuilder("Destination "), destination.f2181h, " does not have an Intent set.").toString());
    }

    @Override // androidx.navigation.v0
    public final boolean j() {
        Activity activity = this.f2184d;
        if (activity != null) {
            activity.finish();
            return true;
        }
        return false;
    }
}
