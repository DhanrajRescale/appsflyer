package td;

import android.content.Context;
import android.content.Intent;
import android.text.SpannableString;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import ba.uh;
import com.assetgro.stockgro.data.AnalyticEvent;
import com.assetgro.stockgro.data.WifiService;
import com.assetgro.stockgro.data.model.Group;
import com.assetgro.stockgro.data.model.GroupMember;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.chat.detail.group.info.GroupInfoV2Fragment;
import com.assetgro.stockgro.ui.chat.detail.group.info.GroupInfoViewModel;
import com.assetgro.stockgro.ui.chat.host.GroupDetailHostActivity;
import java.util.Arrays;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class s extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35946a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GroupInfoV2Fragment f35947b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(GroupInfoV2Fragment groupInfoV2Fragment, int i10) {
        super(1);
        this.f35946a = i10;
        this.f35947b = groupInfoV2Fragment;
    }

    public final void a(Group group) {
        int i10 = this.f35946a;
        GroupInfoV2Fragment groupInfoV2Fragment = this.f35947b;
        switch (i10) {
            case 2:
                Intrinsics.c(group);
                groupInfoV2Fragment.getClass();
                Intrinsics.checkNotNullParameter(group, "group");
                if (groupInfoV2Fragment.getActivity() != null) {
                    Intent intent = new Intent(groupInfoV2Fragment.requireContext(), (Class<?>) GroupDetailHostActivity.class);
                    intent.putExtra("GROUP_CHAT_ID", group.getGroupId());
                    groupInfoV2Fragment.startActivity(intent);
                    return;
                }
                return;
            default:
                ((uh) groupInfoV2Fragment.q()).B.setVisibility(0);
                return;
        }
    }

    public final void d(GroupMember it) {
        int i10 = this.f35946a;
        GroupInfoV2Fragment groupInfoV2Fragment = this.f35947b;
        switch (i10) {
            case 20:
                Intrinsics.checkNotNullParameter(it, "it");
                int i11 = GroupInfoV2Fragment.f9216r;
                groupInfoV2Fragment.O(it);
                return;
            case 21:
                Intrinsics.checkNotNullParameter(it, "it");
                int i12 = GroupInfoV2Fragment.f9216r;
                groupInfoV2Fragment.N(it);
                return;
            case 22:
                Intrinsics.checkNotNullParameter(it, "it");
                int i13 = GroupInfoV2Fragment.f9216r;
                groupInfoV2Fragment.O(it);
                return;
            case 23:
                Intrinsics.checkNotNullParameter(it, "it");
                int i14 = GroupInfoV2Fragment.f9216r;
                groupInfoV2Fragment.N(it);
                return;
            case 24:
                Intrinsics.checkNotNullParameter(it, "it");
                int i15 = GroupInfoV2Fragment.f9216r;
                groupInfoV2Fragment.O(it);
                return;
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                int i16 = GroupInfoV2Fragment.f9216r;
                groupInfoV2Fragment.N(it);
                return;
        }
    }

    public final void e(Boolean bool) {
        int i10 = this.f35946a;
        GroupInfoV2Fragment groupInfoV2Fragment = this.f35947b;
        switch (i10) {
            case 4:
                Intrinsics.c(bool);
                if (bool.booleanValue()) {
                    ((uh) groupInfoV2Fragment.q()).Q.setVisibility(8);
                    ((uh) groupInfoV2Fragment.q()).R.f5385s.setVisibility(0);
                    ((uh) groupInfoV2Fragment.q()).J.setVisibility(8);
                    GroupInfoViewModel groupInfoViewModel = (GroupInfoViewModel) groupInfoV2Fragment.r();
                    if (!WifiService.INSTANCE.getInstance().isOnline()) {
                        groupInfoViewModel.f9083f.setValue(ni.j.i("Not connected to internet"));
                        return;
                    } else {
                        yk.g.H(androidx.lifecycle.u0.f(groupInfoViewModel), qu.r0.f32256b, null, new s0(groupInfoViewModel, null), 2);
                        return;
                    }
                }
                ((uh) groupInfoV2Fragment.q()).Q.setVisibility(0);
                ((uh) groupInfoV2Fragment.q()).R.f5385s.setVisibility(8);
                return;
            case 10:
                uh uhVar = (uh) groupInfoV2Fragment.q();
                Intrinsics.c(bool);
                uhVar.X.setVisibility(el.l.u(bool.booleanValue()));
                return;
            default:
                if (bool != null) {
                    ((uh) groupInfoV2Fragment.q()).V.setChecked(bool.booleanValue());
                    return;
                }
                return;
        }
    }

    public final void f(String text) {
        int i10 = this.f35946a;
        Unit unit = null;
        GroupInfoV2Fragment groupInfoV2Fragment = this.f35947b;
        switch (i10) {
            case 5:
                ImageView riaRraImageView = ((uh) groupInfoV2Fragment.q()).f6304b0;
                Intrinsics.checkNotNullExpressionValue(riaRraImageView, "riaRraImageView");
                al.d.B0(riaRraImageView, text, R.drawable.ic_placeholder_user);
                return;
            case 6:
            case 10:
            case 11:
            case 12:
            default:
                ImageView groupDisplayImageView = ((uh) groupInfoV2Fragment.q()).K;
                Intrinsics.checkNotNullExpressionValue(groupDisplayImageView, "groupDisplayImageView");
                al.d.B0(groupDisplayImageView, text, R.drawable.ic_group_display_placeholder);
                return;
            case 7:
                String string = groupInfoV2Fragment.getString(R.string.text_member_role_updated);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                String text2 = a3.a.m(new Object[]{text}, 1, string, "format(...)");
                Context context = groupInfoV2Fragment.requireContext();
                Intrinsics.checkNotNullExpressionValue(context, "requireContext(...)");
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(text2, "text");
                if (text2.length() != 0) {
                    Toast makeText = Toast.makeText(context, HttpUrl.FRAGMENT_ENCODE_SET, 1);
                    Object systemService = context.getSystemService("layout_inflater");
                    Intrinsics.d(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
                    View inflate = ((LayoutInflater) systemService).inflate(R.layout.background_custom_toast_message, (ViewGroup) null);
                    w.k.c(text2, (TextView) inflate.findViewById(R.id.message), makeText, inflate);
                    return;
                }
                return;
            case 8:
                Context context2 = groupInfoV2Fragment.requireContext();
                Intrinsics.checkNotNullExpressionValue(context2, "requireContext(...)");
                Intrinsics.c(text);
                Intrinsics.checkNotNullParameter(context2, "context");
                Intrinsics.checkNotNullParameter(text, "text");
                if (text.length() != 0) {
                    Toast makeText2 = Toast.makeText(context2, HttpUrl.FRAGMENT_ENCODE_SET, 1);
                    Object systemService2 = context2.getSystemService("layout_inflater");
                    Intrinsics.d(systemService2, "null cannot be cast to non-null type android.view.LayoutInflater");
                    View inflate2 = ((LayoutInflater) systemService2).inflate(R.layout.background_custom_toast_message, (ViewGroup) null);
                    w.k.c(text, (TextView) inflate2.findViewById(R.id.message), makeText2, inflate2);
                    return;
                }
                return;
            case 9:
                if (text != null) {
                    TextView textView = ((uh) groupInfoV2Fragment.q()).R.f5386t;
                    String string2 = groupInfoV2Fragment.getString(R.string.text_group_auto_delete_message);
                    Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                    String format = String.format(string2, Arrays.copyOf(new Object[]{text}, 1));
                    Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                    textView.setText(format);
                    unit = Unit.f23355a;
                }
                if (unit == null) {
                    ((uh) groupInfoV2Fragment.q()).R.f5386t.setText(groupInfoV2Fragment.getString(R.string.text_group_auto_delete_message_default));
                    return;
                }
                return;
            case 13:
                if (text != null && text.length() != 0) {
                    ((uh) groupInfoV2Fragment.q()).O.setVisibility(0);
                    ((uh) groupInfoV2Fragment.q()).f6307e0.setVisibility(0);
                    ((uh) groupInfoV2Fragment.q()).N.setText(text);
                    return;
                }
                return;
            case 14:
                ((uh) groupInfoV2Fragment.q()).M.setText(text);
                return;
            case 15:
                if (text != null && text.length() != 0) {
                    ((uh) groupInfoV2Fragment.q()).J.setVisibility(0);
                    ((uh) groupInfoV2Fragment.q()).I.setText(text);
                    TextView groupDescription = ((uh) groupInfoV2Fragment.q()).I;
                    Intrinsics.checkNotNullExpressionValue(groupDescription, "groupDescription");
                    yk.j.w1(groupDescription, SpannableString.valueOf(text), 5, true, R.string.resizable_text_view_more, R.string.resizable_text_view_less, null);
                    return;
                }
                return;
            case 16:
                ((com.bumptech.glide.g) com.bumptech.glide.b.e(groupInfoV2Fragment.requireContext()).m(text).l(R.drawable.ic_group_cover_placeholder)).z(((uh) groupInfoV2Fragment.q()).H);
                return;
        }
    }

    public final void i(List list) {
        boolean z10;
        boolean z11;
        boolean z12;
        int i10 = this.f35946a;
        GroupInfoV2Fragment groupInfoV2Fragment = this.f35947b;
        switch (i10) {
            case 0:
                if (list != null && !list.isEmpty()) {
                    int i11 = 0;
                    for (Object obj : list) {
                        int i12 = i11 + 1;
                        if (i11 >= 0) {
                            GroupMember groupMember = (GroupMember) obj;
                            if (vt.y.f(list) != i11) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            groupMember.setShowDivider(z10);
                            i11 = i12;
                        } else {
                            vt.y.j();
                            throw null;
                        }
                    }
                    vd.d dVar = groupInfoV2Fragment.f9220j;
                    if (dVar != null) {
                        dVar.u(list);
                        return;
                    } else {
                        Intrinsics.k("moderatorListAdapter");
                        throw null;
                    }
                }
                return;
            case 1:
                if (list != null && !list.isEmpty()) {
                    int i13 = 0;
                    for (Object obj2 : list) {
                        int i14 = i13 + 1;
                        if (i13 >= 0) {
                            GroupMember groupMember2 = (GroupMember) obj2;
                            if (vt.y.f(list) != i13) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            groupMember2.setShowDivider(z11);
                            i13 = i14;
                        } else {
                            vt.y.j();
                            throw null;
                        }
                    }
                    vd.d dVar2 = groupInfoV2Fragment.f9221k;
                    if (dVar2 != null) {
                        dVar2.u(list);
                        return;
                    } else {
                        Intrinsics.k("chatSeederListAdapter");
                        throw null;
                    }
                }
                return;
            case 6:
                if (list != null) {
                    ((uh) groupInfoV2Fragment.q()).f6311i0.setTags(list);
                    return;
                }
                return;
            default:
                if (list != null && !list.isEmpty()) {
                    int i15 = 0;
                    for (Object obj3 : list) {
                        int i16 = i15 + 1;
                        if (i15 >= 0) {
                            GroupMember groupMember3 = (GroupMember) obj3;
                            if (vt.y.f(list) != i15) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            groupMember3.setShowDivider(z12);
                            i15 = i16;
                        } else {
                            vt.y.j();
                            throw null;
                        }
                    }
                    vd.d dVar3 = groupInfoV2Fragment.f9219i;
                    if (dVar3 != null) {
                        dVar3.u(list);
                        return;
                    } else {
                        Intrinsics.k("adminListAdapter");
                        throw null;
                    }
                }
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f35946a;
        GroupInfoV2Fragment groupInfoV2Fragment = this.f35947b;
        switch (i10) {
            case 0:
                i((List) obj);
                return Unit.f23355a;
            case 1:
                i((List) obj);
                return Unit.f23355a;
            case 2:
                a((Group) obj);
                return Unit.f23355a;
            case 3:
                androidx.fragment.app.j0 activity = groupInfoV2Fragment.getActivity();
                if (activity != null) {
                    activity.invalidateOptionsMenu();
                }
                return Unit.f23355a;
            case 4:
                e((Boolean) obj);
                return Unit.f23355a;
            case 5:
                f((String) obj);
                return Unit.f23355a;
            case 6:
                i((List) obj);
                return Unit.f23355a;
            case 7:
                f((String) obj);
                return Unit.f23355a;
            case 8:
                f((String) obj);
                return Unit.f23355a;
            case 9:
                f((String) obj);
                return Unit.f23355a;
            case 10:
                e((Boolean) obj);
                return Unit.f23355a;
            case 11:
                AnalyticEvent analyticEvent = (AnalyticEvent) obj;
                Intrinsics.c(analyticEvent);
                groupInfoV2Fragment.x(analyticEvent);
                return Unit.f23355a;
            case 12:
                a((Group) obj);
                return Unit.f23355a;
            case 13:
                f((String) obj);
                return Unit.f23355a;
            case 14:
                f((String) obj);
                return Unit.f23355a;
            case 15:
                f((String) obj);
                return Unit.f23355a;
            case 16:
                f((String) obj);
                return Unit.f23355a;
            case 17:
                f((String) obj);
                return Unit.f23355a;
            case 18:
                e((Boolean) obj);
                return Unit.f23355a;
            case 19:
                i((List) obj);
                return Unit.f23355a;
            case 20:
                d((GroupMember) obj);
                return Unit.f23355a;
            case 21:
                d((GroupMember) obj);
                return Unit.f23355a;
            case 22:
                d((GroupMember) obj);
                return Unit.f23355a;
            case 23:
                d((GroupMember) obj);
                return Unit.f23355a;
            case 24:
                d((GroupMember) obj);
                return Unit.f23355a;
            default:
                d((GroupMember) obj);
                return Unit.f23355a;
        }
    }
}
