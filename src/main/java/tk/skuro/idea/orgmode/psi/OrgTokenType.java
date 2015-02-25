package tk.skuro.idea.orgmode.psi;

import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import tk.skuro.idea.orgmode.OrgLanguage;

/**
 * Class to represent a Token
 *
 * @author Adrien Khisbe
 * @since 0.3
 */
public class OrgTokenType extends IElementType {

    public OrgTokenType(@NonNls String debugId) {
        super(debugId, OrgLanguage.INSTANCE);
    }

    @Override
    public String toString() {
        return "OrgTokenType:" + super.toString();
    }
}
