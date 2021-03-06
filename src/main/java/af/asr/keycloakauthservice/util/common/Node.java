package af.asr.keycloakauthservice.util.common;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

/**
 * Unbalanced tree Node to hold hierarchy data
 * 
 */
@Getter
public class Node<T> {
	private T value;
	private List<Node<T>> childs;
	private String parentId;
	private String id;
	private Node<T> parent;

	public Node(String id, T value, String parentId) {
		this.id = id;
		this.parentId = parentId;
		this.value = value;
	}

	public void setId(String id) {
		this.id = id;
	}

	public boolean addChild(Node<T> child) {
		if (childs == null) {
			childs = new ArrayList<>();
		}
		return childs.add(child);
	}

	public boolean addChilds(List<Node<T>> list) {
		if (childs == null) {
			childs = new ArrayList<>();
		}
		return childs.addAll(list);
	}

	public void setValue(T value) {
		this.value = value;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	public void setParent(Node<T> parent) {
		this.parent = parent;
	}
}
